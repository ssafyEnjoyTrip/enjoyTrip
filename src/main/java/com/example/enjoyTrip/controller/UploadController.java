package com.example.enjoyTrip.controller;

import com.example.enjoyTrip.dto.ArticleFileDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UploadController {
    @Value("${app.fileupload.uploadPath}")
    String uploadPath;

    @Value("${app.fileupload.uploadFolder}")
    String uploadFolder;

    @PostMapping("upload")
    public ResponseEntity<List<ArticleFileDto>> upload(MultipartFile[] file) throws IOException {

        List<ArticleFileDto> dtoList = new ArrayList<>();

        for(MultipartFile uploadFile : file) {
            System.out.println(uploadFile);
            String originalName = uploadFile.getOriginalFilename();
            String fileName = originalName.substring(originalName.lastIndexOf("\\") +1);

            String fileUrl = makeFolder();

            String saveName = uploadPath + File.separator + fileUrl + File.separator + "_" + fileName;
            //saveName = uploadPath\folderPath\ uuid_fileName
            Path savePath = Paths.get(saveName); // 상대 경로 정의

            try {
                uploadFile.transferTo(savePath);
                dtoList.add(new ArticleFileDto(fileName, fileUrl));
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        return new ResponseEntity<>(dtoList, HttpStatus.OK);
    }
    private String makeFolder() {
        String str = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String folderPath = str.replace("/", File.separator); // ""yyyy/MM/dd에서 "/" 를 "\" 로 변경
        //make folder
        File uploadPathFolder = new File(uploadPath, folderPath); // c://upload/folderPath....
        if(uploadPathFolder.exists() == false){ //uploadPath에 folderPath가 존재하지 않는다면
            uploadPathFolder.mkdirs(); //만들어준다.
        }
        return folderPath;
    }
}

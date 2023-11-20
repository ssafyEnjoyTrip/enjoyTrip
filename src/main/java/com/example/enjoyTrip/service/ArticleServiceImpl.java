package com.example.enjoyTrip.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.enjoyTrip.config.auth.PrincipalDetails;
import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.ArticleFile;
import com.example.enjoyTrip.entity.User;
import com.example.enjoyTrip.repository.ArticleFileRepository;
import com.example.enjoyTrip.repository.ArticleRepository;
import com.example.enjoyTrip.repository.IArticle;
import com.example.enjoyTrip.repository.UserRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

	@Value("${app.fileupload.uploadPath}")
	String uploadPath;

	@Value("${app.fileupload.uploadFolder}")
	String uploadFolder;

	private final UserRepository userRepository;

	private final ArticleRepository articleRepository;

	private final ArticleFileRepository articleFileRepository;

	@Override
	public List<Article> findAll() {
		return articleRepository.findAll();
	}

	@Override
	public Article detail(int articleId) {
		return articleRepository.findById(articleId).orElse(null);
	}

	@Override
	@Transactional
	public String insert(ArticleDto dto, MultipartHttpServletRequest request) {

		List<File> rollbackFileList = new ArrayList<>();
		try {
			String title = dto.getTitle();
			String content = dto.getContent();
			Article article = new Article();

			User user = getUser();
			article.setUser(user);
			article.setTitle(title);
			article.setContent(content);

			Article saved = articleRepository.save(article);// 일단 게시글 저장

			List<MultipartFile> fileList = request.getFiles("file");

			File uploadDir = new File(uploadPath + File.separator + uploadFolder);
			if (!uploadDir.exists()) uploadDir.mkdir();

			for (MultipartFile part : fileList) {

				String fileName = part.getOriginalFilename();

				//Random File Id
				UUID uuid = UUID.randomUUID();

				//file extension
				String extension = FilenameUtils.getExtension(fileName); // vs FilenameUtils.getBaseName()

				String savingFileName = uuid + "." + extension;

				File destFile = new File(uploadPath + File.separator + uploadFolder + File.separator + savingFileName);

				// transaction test #2 해결
				// rollback 할 때 물리적으로 저장된 파일도 삭제하기 위해
				rollbackFileList.add(destFile);

				part.transferTo(destFile);

				// Table Insert
				ArticleFile articleFile = new ArticleFile();
				articleFile.setArticle(saved);
				articleFile.setFileName(fileName);
				articleFile.setFileSize(part.getSize());
				articleFile.setFileContentType(part.getContentType());
				String articleFileUrl = uploadFolder + "/" + savingFileName;
				articleFile.setFileUrl(articleFileUrl);

				// transaction test #2
				// 테이블에 insert + 물리적인 파일도 저장
				// transaction 만 처리하면 테이블과 다르게 물리적으로 저장된 파일은 남아 있다.
//                String s = null;
//                s.length();

				articleFileRepository.save(articleFile);
			}

			return "success";
		} catch (Exception e) {
			e.printStackTrace();

			// transaction test #2 해결
			// 물리적인 파일도 삭제해 준다.
			for (File file : rollbackFileList) {
				if (file.exists()) {
					file.delete();
				}
			}

			return "fail";
		}
	}


	@Override
	public List<Article> findByTitleLike(String keyword) {
		return articleRepository.findByTitleLike( "%" + keyword + "%");
	}

	@Override
	public void deleteById(int articleId) {
		articleRepository.deleteById(articleId);
		
	}

	@Override
	public void increaseHeartCount(int articleId) {
		articleRepository.incrementHeartCount(articleId);
	}

	@Override
	public void decreaseHeartCount(int articleId) {
		articleRepository.decrementHeartCount(articleId);
	}



	public User getUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		int userId = ((PrincipalDetails) authentication.getPrincipal()).getUserId(); // 현재 로그인한 회원 id
		return userRepository.findById(userId)
				.orElseThrow(() -> new RuntimeException("로그인 유저 정보가 없습니다"));
	}
}

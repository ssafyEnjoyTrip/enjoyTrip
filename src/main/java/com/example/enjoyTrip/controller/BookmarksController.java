package com.example.enjoyTrip.controller;

import com.example.enjoyTrip.dto.BookMarkAttractionDto;
import com.example.enjoyTrip.service.BookmarksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookmarks")
public class BookmarksController {

    private final BookmarksService bookmarksService;

    @PostMapping
    public String checkBookmark(@RequestBody BookMarkAttractionDto dto){
        System.out.println(dto);
        System.out.println(dto.getUserId() + " " + dto.getAttractionId());
        BookMarkAttractionDto subDto = bookmarksService.findByUserIdAndAttractionId(dto.getUserId(), dto.getAttractionId());
        System.out.println(subDto);
        if(subDto == null){
            return "FAIL";
        }
        return "SUCCESS";
    }

    @PostMapping("/save")
    public String saveBookmark(@RequestBody BookMarkAttractionDto dto){
        System.out.println("-------------------------------------------------------------------");
        System.out.println(dto);
        bookmarksService.save(dto);
        return "SUCCESS";
    }
//    @PostMapping("/delete")
    @DeleteMapping
    public String deleteBookmark(@RequestBody BookMarkAttractionDto dto){
        System.out.println("deleteBookmarks'dto: " + dto);
        bookmarksService.deleteBookmarks(dto.getUserId(), dto.getAttractionId());
        return "SUCCESS";
    }


}

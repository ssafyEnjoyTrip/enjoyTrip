package com.example.enjoyTrip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.CommentSaveDto;
import com.example.enjoyTrip.entity.ArticleComment;
import com.example.enjoyTrip.service.ArticleService;
import com.example.enjoyTrip.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;
    private final ArticleService articleService;

    @GetMapping("/")
    List<ArticleComment> comment(){
        System.out.println("TEST");
        return commentService.findAll();
    }

    @GetMapping("/{articleId}")
    public List<ArticleComment> articleComment(@PathVariable int articleId){
        List<ArticleComment> comment = commentService.findByArticleArticleId(articleId);
        System.out.println(comment.size());
        return comment;
    }

    @PostMapping("/save")
    public ArticleComment commentSave(@RequestBody CommentSaveDto dto){
    	ArticleComment comment = new ArticleComment();
    	comment.setComment(dto.getComment());
    	comment.setUserId(dto.getUserId());
//    	comment.getArticle(articleService.findById(dto.getArticleId()));
        return commentService.save(comment);
    }
}

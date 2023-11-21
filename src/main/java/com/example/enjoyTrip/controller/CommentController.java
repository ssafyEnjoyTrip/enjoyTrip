package com.example.enjoyTrip.controller;

import java.util.List;

import com.example.enjoyTrip.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.CommentSaveDto;
import com.example.enjoyTrip.entity.ArticleComment;
import com.example.enjoyTrip.repository.ArticleCommentRepository;
import com.example.enjoyTrip.repository.ArticleRepository;
import com.example.enjoyTrip.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;


    @GetMapping("/{articleId}")
    public List<ArticleComment> articleComment(@PathVariable int articleId){
        List<ArticleComment> comment = commentService.findByArticleArticleId(articleId);
        System.out.println(comment.size());
        return comment;
    }

    @PostMapping
    public ArticleComment commentSave(@RequestBody CommentSaveDto dto){
        return commentService.insert(dto);
    }
}

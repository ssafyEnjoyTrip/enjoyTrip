package com.example.enjoyTrip.controller;

import com.example.enjoyTrip.entity.ArticleComment;
import com.example.enjoyTrip.repository.ArticleCommentRepository;
import com.example.enjoyTrip.service.CommentService;
import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

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
    public ArticleComment commentSave(@RequestBody ArticleComment comment){
        System.out.println(comment);


        return null;
        //return commentService.save(comment);
    }
}

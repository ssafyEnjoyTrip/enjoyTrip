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
    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository commentReoisitory;
    private final UserRepository userRepository;

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
    	System.out.println( "Comment Controller" + dto);
    	ArticleComment comment = new ArticleComment();
    	comment.setComment(dto.getComment());
    	comment.setUser(userRepository.findById(dto.getUserId()).orElse(null));
    	comment.setArticle(articleRepository.findById(dto.getArticleId()).orElse(null));
    	System.out.println(comment);
        return commentReoisitory.save(comment);
    }
}

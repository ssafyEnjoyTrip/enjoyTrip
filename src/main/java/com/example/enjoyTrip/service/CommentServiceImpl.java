package com.example.enjoyTrip.service;

import com.example.enjoyTrip.entity.ArticleComment;
import com.example.enjoyTrip.repository.ArticleCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{

    private final ArticleCommentRepository articleCommentRepository;
    @Override
    public List<ArticleComment> findAll() {
        return articleCommentRepository.findAll();
    }
    public List<ArticleComment>  findByArticleArticleId(int articleId){
        return articleCommentRepository.findByArticleArticleId(articleId);
    }
    public ArticleComment save(ArticleComment comment){
        return articleCommentRepository.save(comment);
    }

}

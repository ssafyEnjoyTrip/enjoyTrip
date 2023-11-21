package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.CommentSaveDto;
import com.example.enjoyTrip.entity.ArticleComment;

import java.util.List;

public interface CommentService {
    List<ArticleComment> findAll();
    List<ArticleComment>  findByArticleArticleId(int articleId);

    ArticleComment insert(CommentSaveDto dto);
}

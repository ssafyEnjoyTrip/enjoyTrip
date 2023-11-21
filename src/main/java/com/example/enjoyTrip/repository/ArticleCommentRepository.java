package com.example.enjoyTrip.repository;

import com.example.enjoyTrip.entity.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Integer> {
    List<ArticleComment> findByArticleArticleId(int articleId);

    List<ArticleComment> findAllByUserUserId(int userId);

}

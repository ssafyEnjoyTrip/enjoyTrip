package com.example.enjoyTrip.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.enjoyTrip.dto.ListDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.repository.IArticle;

// update 메소드는 없다길래 일단 나중에 구현
public interface ArticleService {
	List<Article> list();
	Article detail(int articleId);
	int insert(Article dto);
	int delete(int articleId);
	List<Article> findByTitleLike(String keyword);
	List<IArticle> findList();
	IArticle singleDetail(@Param("articleId") int articleId);
}

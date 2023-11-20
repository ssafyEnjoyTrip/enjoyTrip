package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.ArticleDto;
import org.springframework.data.repository.query.Param;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.repository.IArticle;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartHttpServletRequest;

// update 메소드는 없다길래 일단 나중에 구현
public interface ArticleService {
	List<Article> findAll();
	Article detail(int articleId);
	String insert(ArticleDto dto, MultipartHttpServletRequest request);
	List<Article> findByTitleLike(String keyword);
	void deleteById(int articleId);

	void increaseHeartCount(int articleId);
	void decreaseHeartCount(int articleId);

	
}

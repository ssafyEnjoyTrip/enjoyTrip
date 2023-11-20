package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.ArticleDto;
import org.springframework.data.repository.query.Param;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.repository.IArticle;
import org.springframework.data.repository.query.Param;

// update 메소드는 없다길래 일단 나중에 구현
public interface ArticleService {
	List<Article> findAll();
	Article detail(int articleId);

	Article insert(ArticleDto dto);
	List<Article> findByTitleLike(String keyword);
	List<IArticle> findList();
//	List<Article> findByUser();
//	Article findByArticleId(int articleId);		
	IArticle singleDetail(int articleId);
	void deleteById(int articleId);
	
}

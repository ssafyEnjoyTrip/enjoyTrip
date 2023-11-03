package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.ArticleDto;

public interface ArticleService {
	List<ArticleDto> articleList();
	ArticleDto articleDetail(int articleId);
	int update(ArticleDto dto);
	int delete(int articleId);
	int insert(ArticleDto dto);

}

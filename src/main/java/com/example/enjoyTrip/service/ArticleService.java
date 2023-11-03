package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.ArticleDto;

public interface ArticleService {

	List<ArticleDto> articleList();
	ArticleDto articleDetail(int articleId); // 상세
	int articleInsert(ArticleDto dto); // 등록
	int articleUpdate(ArticleDto dto); // 수정
	int articleDelete(int articleId); // 삭제
}

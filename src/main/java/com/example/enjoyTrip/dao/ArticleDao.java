package com.example.enjoyTrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.enjoyTrip.dto.ArticleDto;

@Mapper
public interface ArticleDao {

	List<ArticleDto> articleList();
	ArticleDto articleDetail(int articleId); // 상세
	int articleInsert(ArticleDto dto); // 등록
	int articleUpdate(ArticleDto dto); // 수정
	int articleDelete(int articleId); // 삭제
}

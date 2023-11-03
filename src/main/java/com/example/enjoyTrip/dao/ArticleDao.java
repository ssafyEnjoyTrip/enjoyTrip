package com.example.enjoyTrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.enjoyTrip.dto.ArticleDto;


@Mapper
public interface ArticleDao {
	List<ArticleDto> articleList();
	ArticleDto articleDetail(int articleId);
	int update(ArticleDto dto);
	int delete(int articleId);
	int insert(ArticleDto dto);
	
}

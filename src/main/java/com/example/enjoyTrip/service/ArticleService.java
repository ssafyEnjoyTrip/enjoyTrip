package com.example.enjoyTrip.service;

import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.dto.ArticleParamDto;
import com.example.enjoyTrip.dto.ArticleResultDto;
import com.example.enjoyTrip.entity.Article;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

public interface ArticleService {
	ArticleResultDto findAll(ArticleParamDto articleParamDto);
	ArticleResultDto findByTitleLike(ArticleParamDto articleParamDto);
	Article detail(int articleId);
	String insert(ArticleDto dto, MultipartHttpServletRequest request);
	void deleteById(int articleId);
	void update(ArticleDto articleDto);
	
}

package com.example.enjoyTrip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.enjoyTrip.dao.ArticleDao;
import com.example.enjoyTrip.dto.ArticleDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

	private final ArticleDao dao;
	@Override
	public List<ArticleDto> articleList() {
		return dao.articleList();
	}

	@Override
	public ArticleDto articleDetail(int articleId) {
		return dao.articleDetail(articleId);
	}

	@Override
	public int update(ArticleDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int articleId) {
		return dao.delete(articleId);
	}

	@Override
	public int insert(ArticleDto dto) {
		return dao.insert(dto);
	}

}

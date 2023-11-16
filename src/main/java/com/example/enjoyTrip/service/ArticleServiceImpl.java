package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.ListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.repository.ArticleRepository;
import com.example.enjoyTrip.repository.IArticle;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	ArticleRepository articleRepository;

	@Override
	public List<Article> list() {
		return articleRepository.findAll();
	}

	@Override
	public Article detail(int articleId) {
		return articleRepository.findById(articleId).orElse(null);
	}

	@Override
	public int insert(Article dto) {
		Article isDup = detail(dto.getArticleId());
		
		// 중복 확인 중복인 값이 없다면 1을 리턴
		if(isDup == null) {
			// 저장하고 즉시 반영
			articleRepository.saveAndFlush(isDup);
			return 1;
		}
		return 0;
	}

	@Override
	public int delete(int articleId) {		
		articleRepository.deleteById(articleId);
		return 1;
	}

	@Override
	public List<Article> findByTitleLike(String keyword) {
		return articleRepository.findByTitleLike( "%" + keyword + "%");
	}

	@Override
	public List<IArticle> findList(){
		return articleRepository.findList();
	}

	@Override
	public IArticle singleDetail(@Param("articleId") Integer articleId){
		return articleRepository.singleDetail(articleId);
	}
}

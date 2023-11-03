package com.example.enjoyTrip.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.service.ArticleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
public class ArticleController {
	
	private final ArticleService service;
	
	@GetMapping("/")
	public List<ArticleDto> list() {
		return service.articleList();
	}
	
	@GetMapping("/{articleId}")
	public ArticleDto detail(@PathVariable int articleId) {
		return service.articleDetail(articleId);
	}
	
	@PostMapping("/")
	public int insert(ArticleDto dto) {
		return service.insert(dto);
	}
	
	@PutMapping("/{articleId}")
	public int update(@PathVariable int articleId, ArticleDto dto) {
		dto.setArticleId(articleId);
		return service.update(dto);
	}
	
	@DeleteMapping("/{articleId}")
	public int delete(@PathVariable int articleId) {
		return service.delete(articleId);
	}
}

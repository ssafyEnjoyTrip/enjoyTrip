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
	public List<ArticleDto> list(){
		return service.articleList();
	}
	
	@GetMapping("/{articleId}")
	public ArticleDto detail(@PathVariable int articleId) {
		return service.articleDetail(articleId);
	}
	
	@PostMapping("/")
	public String insert(ArticleDto dto) {
		int result = service.articleInsert(dto);
		if( result == 1) {
			return "게시글 등록이 완료되었습니다.";
		}
		return "게시글 등록에 문제가 발생했습니다.";
	}
	
	
	@PutMapping("/{articleId}")
	public String update(@PathVariable int articleId, ArticleDto dto) {
		int result = service.articleUpdate(dto);
		if( result == 1) {
			return "게시글 수정이 완료되었습니다.";
		}
		return "수정하려는 게시글이 없습니다.";
	}
	
	
	@DeleteMapping("/{articleId}")
	public String delete(@PathVariable int articleId) {
		int result = service.articleDelete(articleId);
		if( result == 1) {
			return "게시글 삭제가 완료되었습니다.";
		}
		return "삭제하려는 게시글이 없습니다.";
	}
}

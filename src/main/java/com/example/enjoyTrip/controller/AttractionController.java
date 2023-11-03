package com.example.enjoyTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.ArticleDto;

@RestController
@RequestMapping("/article")
public class AttractionController {
	
	@Autowired
	AttractionService service;
	
	@GetMapping("/")
	public List<ArticleDto> list(){
		return service.list();
	}
	
	@GetMapping("/{keyword}")
	public ArticleDto search(@PathVariable String keyword) {
		return service.search(keyword);
	}
	
	@GetMapping("/{articleId}")
	public int detail(@PathVariable int articleId) {
		return service.detail(articleId);
	}
	
	@PutMapping("/{articleId}")
	public int update(@PathVariable int articleId, articleDto dto) {
		return service.update(dto);
	}
	
	@DeleteMapping("/{articleId}")
	public int delete(@PathVariable int articleId) {
		return service.delete(articleId);
	}
	
	@PostMapping("/")
	public int insert(ArticleDto dto) {
		return service.insert(dto);
	}
	
}

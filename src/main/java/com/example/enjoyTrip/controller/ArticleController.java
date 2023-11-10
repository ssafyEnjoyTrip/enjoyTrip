package com.example.enjoyTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.service.ArticleService;

@RestController
@RequestMapping("/article")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@GetMapping("/list")
	public List<Article> list(){
		return articleService.list();
	}
	
	@GetMapping("/{articleId}")
	public Article detail(@PathVariable int articleId) {
		return articleService.detail(articleId);		
	}
	
	@PostMapping("/insert")
	public int insert(@RequestBody Article dto) {
		articleService.insert(dto);
		return 1;
	}
	
	@DeleteMapping("/{articleId}")
	public int delete(@PathVariable int articleId) {
		return articleService.delete(articleId);
	}
	
	@PostMapping("/{keyword}")
	public List<Article> search(String keyword){
		return articleService.findByTitleLike(keyword);
	}
}














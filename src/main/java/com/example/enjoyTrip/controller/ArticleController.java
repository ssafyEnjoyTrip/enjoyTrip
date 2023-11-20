package com.example.enjoyTrip.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.example.enjoyTrip.dto.ArticleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.repository.IArticle;
import com.example.enjoyTrip.service.ArticleService;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@RestController
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {

	private final ArticleService articleService;
	
	@GetMapping("/list")
	public List<IArticle> list(){
		return articleService.findList();
	}
	
	@GetMapping("/{articleId}")
	public IArticle detail(@PathVariable int articleId) {
		return articleService.singleDetail(articleId);
	}
	
	@PostMapping
	public String insert(ArticleDto dto, MultipartHttpServletRequest request) {
		return articleService.insert(dto, request);
	}
	
	@DeleteMapping("/{articleId}")
	public void delete(@PathVariable int articleId) {
		articleService.deleteById(articleId);
		System.out.println("삭제되었나요");
	}
	
	@PostMapping("/{keyword}")
	public List<Article> search(@PathVariable String keyword){
		return articleService.findByTitleLike(keyword);
	}


}














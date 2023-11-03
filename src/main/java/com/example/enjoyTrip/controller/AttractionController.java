package com.example.enjoyTrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
		
	}
	
}

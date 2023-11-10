package com.example.enjoyTrip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	List<Article> findByTitleLike(String keyword);
}

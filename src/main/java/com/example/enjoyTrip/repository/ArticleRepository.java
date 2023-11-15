package com.example.enjoyTrip.repository;

import java.util.List;

import com.example.enjoyTrip.dto.ListDto;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.enjoyTrip.dto.ArticleDto;
import com.example.enjoyTrip.entity.Article;
import org.springframework.data.jpa.repository.Query;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	List<Article> findByTitleLike(String keyword);

	//@Query("select a.articleId, a.title, a.registerTime, a.commentsCount, a.content , u.name, u.email from Article as a join User as u where a.userId = u.id")
//	@Query(value="select a.articleId, a.title, a.registerTime, a.commentsCount, a.content , u.name, u.email from Article as a join User as u on a.userId = u.id")
//	List<Article> findList();
	
	@Query(value="select a.articleId AS articleId, a.title AS title, a.registerTime AS registerTime"
			+ ", a.commentsCount AS commentsCount, a.content AS content , u.name AS name, u.email AS email"
			+ " from Article as a join User as u on a.userId = u.id")
	List<IArticle> findList();
	
	
}

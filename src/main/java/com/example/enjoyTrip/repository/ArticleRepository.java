package com.example.enjoyTrip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.enjoyTrip.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	List<Article> findByTitleLike(String keyword);

	//@Query("select a.articleId, a.title, a.registerTime, a.commentsCount, a.content , u.name, u.email from Article as a join User as u where a.userId = u.id")
//	@Query(value="select a.articleId, a.title, a.registerTime, a.commentsCount, a.content , u.name, u.email from Article as a join User as u on a.userId = u.id")
//	List<Article> findList();
	
//	@Query(value="select a.articleId AS articleId, a.title AS title, a.registerTime AS registerTime"
//			+ ", a.commentsCount AS commentsCount, a.content AS content , u.name AS name, u.email AS email"
//			+ " from Article as a join User as u on a.userId = u.id")
//	List<IArticle> findList();
	
	
//	@Query(value="select a.title AS title, a.registerTime AS registerTime"
//			+ ", a.commentsCount AS commentsCount, a.content AS content , u.name AS name, u.email AS email"
//			+ " from Article as a join User as u on a.userId = u.id and a.articleId = :articleId")
//	IArticle singleDetail(@Param("articleId") int articleId);
	
	
}

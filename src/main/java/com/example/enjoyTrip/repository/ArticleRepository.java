package com.example.enjoyTrip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.enjoyTrip.entity.Article;
import org.springframework.data.repository.query.Param;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	List<Article> findByTitleLike(String keyword);

	//
	@Query(value = "select a.articleId AS articleId,a.title AS title, a.registerTime AS registerTime, a.content AS content, u.name AS name," +
			" u.name AS name, count(c.comment) AS commentsCount from " +
			"Article AS a JOIN User AS u ON a.user.id = u.userId JOIN ArticleComment AS c " +
			"ON a.articleId = c.article.articleId group by a.articleId")
	List<IArticle> findList();

	@Query(value = "select a.articleId AS articleId, a.title AS title, a.registerTime AS registerTime, a.content AS content, u.name AS name," +
			" u.name AS name, count(c.comment) AS commentsCount from " +
			"Article AS a JOIN User AS u ON a.user.id = u.userId JOIN ArticleComment AS c " +
			"ON a.articleId = c.article.articleId where a.articleId = :articleId")
	IArticle singleDetail(@Param("articleId") int articleId);


}

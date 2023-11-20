package com.example.enjoyTrip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.ArticleComment;

import org.springframework.data.repository.query.Param;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	List<Article> findByTitleLike(String keyword);

	List<Article> findByArticleId(int articleId);

	@Query(value = "select a.articleId AS articleId, a.title AS title, a.registerTime AS registerTime, a.content AS content," +
			" u.name AS name from " +
			"Article AS a JOIN User AS u ON a.user.id = u.userId where a.articleId = :articleId")
	IArticle singleDetail(@Param("articleId") int articleId);


	void deleteById(@Param("articleId") int articleId);
}

package com.example.enjoyTrip.repository;

import java.util.List;

import com.example.enjoyTrip.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.ArticleComment;

import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
	List<Article> findByTitleLike(String keyword);
	void deleteById(@Param("articleId") int articleId);
	List<Article> findAllByUser(User user);

	@Modifying
	@Transactional
	@Query("UPDATE Article a SET a.heartCount = a.heartCount + 1 WHERE a.articleId = :articleId")
	void incrementHeartCount(int articleId);

	@Modifying
	@Transactional
	@Query("UPDATE Article a SET a.heartCount = a.heartCount - 1 WHERE a.articleId = :articleId AND a.heartCount > 0")
	void decrementHeartCount(int articleId);

}

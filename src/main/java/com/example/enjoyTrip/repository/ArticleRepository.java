package com.example.enjoyTrip.repository;

import java.util.List;

import com.example.enjoyTrip.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.ArticleComment;

import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface ArticleRepository extends JpaRepository<Article, Integer>{
//	List<Article> findByTitleLike(String keyword);
	void deleteById(@Param("articleId") int articleId);
	List<Article> findAllByUserOrderByRegisterTimeDesc(User user);

	// 검색어(searchWord)에 맞춰서 페이징 처리된 게시글 목록을 가져오는 쿼리
	@Query(value = "SELECT a FROM Article a WHERE " +
			"(:searchWord IS NULL OR a.title LIKE %:searchWord% OR a.content LIKE %:searchWord%)")
	Page<Article> findBySearchWord(String searchWord, Pageable pageable);


	@Modifying
	@Transactional
	@Query("UPDATE Article a SET a.heartCount = a.heartCount + 1 WHERE a.articleId = :articleId")
	void incrementHeartCount(int articleId);

	@Modifying
	@Transactional
	@Query("UPDATE Article a SET a.heartCount = a.heartCount - 1 WHERE a.articleId = :articleId AND a.heartCount > 0")
	void decrementHeartCount(int articleId);

}

package com.example.enjoyTrip.repository;

import java.sql.Timestamp;

public interface IArticle {
//	@Query(value="select a.articleId, a.title, a.registerTime, 
//					a.commentsCount, a.content , u.name, u.email 
// 				from Article as a join User as u on a.userId = u.id")
	Integer getArticleId();
	String getTitle();
	Timestamp getRegisterTime();
	Integer getCommentsCount();
	String getContent();
	String getName();
	String getEmail();	
}

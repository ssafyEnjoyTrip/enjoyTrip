package com.example.enjoyTrip.repository;

import java.sql.Timestamp;

public interface IArticle {
	Integer getArticleId();
	String getTitle();
	Timestamp getRegisterTime();
	String getContent();
	String getName();
	String getEmail();
	String getComment();
	Integer getCommentsCount();
}

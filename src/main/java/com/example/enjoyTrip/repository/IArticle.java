package com.example.enjoyTrip.repository;

import java.sql.Timestamp;

public interface IArticle {
	Integer getArticleId();
	String getTitle();
	Timestamp getRegisterTime();
	Integer getCommentsCount();
	String getContent();
	String getName();
	String getEmail();	
}

package com.example.enjoyTrip.repository;

import java.sql.Timestamp;

public interface IArticle {
	int getArticleId();
	String getTitle();
	Timestamp getRegisterTime();
	String getContent();
	String getName();
	String getEmail();	
}

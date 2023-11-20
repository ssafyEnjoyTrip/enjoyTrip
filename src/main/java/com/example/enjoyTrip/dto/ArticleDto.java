package com.example.enjoyTrip.dto;

import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArticleDto {
	private int articleId;
	private String userId;
	private String title;
	private Timestamp registerTime;
	private int commentsCount;
	private String content;

	private List<ArticleFileDto> fileList;
}

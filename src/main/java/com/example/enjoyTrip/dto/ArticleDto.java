package com.example.enjoyTrip.dto;

import java.time.LocalDateTime;

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
	private LocalDateTime registerTime;
	private int commentsCount;
	private String content;

}

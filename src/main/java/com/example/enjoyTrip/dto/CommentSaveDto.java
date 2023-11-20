package com.example.enjoyTrip.dto;

import com.example.enjoyTrip.entity.Article;

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
public class CommentSaveDto {
	private String comment;
	private int userId;
	private int articleId;
}

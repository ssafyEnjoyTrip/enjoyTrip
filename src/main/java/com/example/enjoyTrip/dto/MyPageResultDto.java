package com.example.enjoyTrip.dto;

import java.util.List;

import com.example.enjoyTrip.entity.Article;
import com.example.enjoyTrip.entity.ArticleComment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class MyPageResultDto {
    private List<MyPageAttractionDto> bookMarkAttractionList;
    private List<Article> myPageArticleList;
    private List<ArticleComment> myPageCommentList;
    private List<Article> myPageWriteArticleList;
}

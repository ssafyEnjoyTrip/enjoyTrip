package com.example.enjoyTrip.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ArticleParamDto {

    private int limit;
    private int offset;
    private String searchWord;
    private int articleId;
    private int userId;
}

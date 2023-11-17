package com.example.enjoyTrip.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ListDto {
    private int articleId;
    private String title;
    private Timestamp registerTime;
    private int commentsCount;
    private String content;
    private String email;
    private String comment;
    private String name;
}

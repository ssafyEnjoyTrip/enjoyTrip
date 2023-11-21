package com.example.enjoyTrip.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public class ArticleFileDto {

    private int fileId;
    private int articleId;
    private String fileName;
    private long fileSize;
    private String fileContentType;
    private String fileUrl;
    private LocalDateTime regDt;
}

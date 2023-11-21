package com.example.enjoyTrip.dto;
import java.time.LocalDateTime;
import java.util.List;

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
public class ArticleResultDto {
    private int result;
    private Article article; // 상세
    private List<Article> list; // 목록 여러건
    private int count; // 총건수
}

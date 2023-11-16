package com.example.enjoyTrip.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "article_id")
    private int articleId;

    @Column(name = "user_id", nullable = false)
    private int userId;
    
    @Basic
    @Column(name = "title", nullable = false)
    private String title;
    
    @Basic
    @Column(name = "register_time")
    private Timestamp registerTime;
    
    @Basic
    @Column(name = "content", nullable = false)
    private String content;
    
    @Basic
    @Column(name = "comments_count")
    private Integer commentsCount;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return articleId == article.articleId && Objects.equals(userId, article.userId) && Objects.equals(title, article.title) && Objects.equals(registerTime, article.registerTime) && Objects.equals(commentsCount, article.commentsCount) && Objects.equals(content, article.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, userId, title, registerTime, commentsCount, content);
    }
}

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
    private Integer articleId;

    @Column(name = "user_id", nullable = false)
    private Integer userId;
    
    @Basic
    @Column(name = "title")
    private String title;
    
    @Basic
    @Column(name = "register_time")
    private Timestamp registerTime;
    
    @Basic
    @Column(name = "content")
    private String content;
    
    @Basic
    @Column(name = "comments_count")
    private Integer commentsCount;

//    @ManyToOne
//    @JoinColumn(name="id")
//    private User user;
    
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

  

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

   

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

   

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

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

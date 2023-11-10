package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Article {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "article_id")
    private int articleId;

    @Basic
    @Column(name = "user_id")
    private String userId;
    
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
    
    @Basic
    @Column(name = "member_id")
    private Integer memberId;
    
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

   

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return articleId == article.articleId && Objects.equals(userId, article.userId) && Objects.equals(title, article.title) && Objects.equals(registerTime, article.registerTime) && Objects.equals(commentsCount, article.commentsCount) && Objects.equals(content, article.content) && Objects.equals(memberId, article.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, userId, title, registerTime, commentsCount, content, memberId);
    }
}

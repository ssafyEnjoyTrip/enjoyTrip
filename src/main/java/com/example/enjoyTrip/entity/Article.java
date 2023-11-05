package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Article {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "article_id")
    private int articleId;
    @Basic
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "register_time")
    private Timestamp registerTime;
    @Basic
    @Column(name = "comments_count")
    private Integer commentsCount;
    @Basic
    @Column(name = "content")
    private String content;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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

        if (articleId != article.articleId) return false;
        if (memberId != article.memberId) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (registerTime != null ? !registerTime.equals(article.registerTime) : article.registerTime != null)
            return false;
        if (commentsCount != null ? !commentsCount.equals(article.commentsCount) : article.commentsCount != null)
            return false;
        if (content != null ? !content.equals(article.content) : article.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = articleId;
        result = 31 * result + memberId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        result = 31 * result + (commentsCount != null ? commentsCount.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}

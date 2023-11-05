package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "article_comment", schema = "enjoytrip", catalog = "")
public class ArticleComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "comment_id")
    private int commentId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "article_id")
    private int articleId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "member_id")
    private int memberId;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "comment")
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleComment that = (ArticleComment) o;
        return commentId == that.commentId && articleId == that.articleId && memberId == that.memberId && Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, articleId, memberId, comment);
    }
}

package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
@Table(name = "article_comment", schema = "enjoytrip", catalog = "")
public class ArticleComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "comment_id")
    private int commentId;
    @Basic
    @Column(name = "article_id")
    private int articleId;
    @Basic
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "comment")
    private String comment;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

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

        if (commentId != that.commentId) return false;
        if (articleId != that.articleId) return false;
        if (memberId != that.memberId) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + articleId;
        result = 31 * result + memberId;
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        return result;
    }
}

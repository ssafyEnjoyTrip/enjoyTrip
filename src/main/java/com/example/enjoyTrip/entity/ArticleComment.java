package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@javax.persistence.Table(name = "article_comment", schema = "enjoytrip", catalog = "")
public class ArticleComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "comment_id")
    private int commentId;

    @Basic
    @Column(name = "article_id")
    private int articleId;

    @Basic
    @Column(name = "user_id")
    private int userId;

    @Basic
    @Column(name = "comment")
    private String comment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleComment that = (ArticleComment) o;
        return commentId == that.commentId && articleId == that.articleId && userId == that.userId && Objects.equals(comment, that.comment) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, articleId, userId, comment);
    }
}

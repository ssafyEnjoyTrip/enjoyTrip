package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode
@javax.persistence.Table(name = "article_comment", schema = "enjoytrip", catalog = "")
public class ArticleComment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "comment_id")
    private int commentId;

    @Column(name = "comment")
    private String comment;

    @Column(name="user_id")
    private int userId;

    @Column(name="comment_register_time")
    private Timestamp commentRegisterTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "article_id")
    private Article article;
}

package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Table(name = "article_comment")
public class ArticleComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name="user_id")
    @OnDelete(action=OnDeleteAction.CASCADE)
    private User user;

    @Column(name="comment_register_time")
    @CreationTimestamp
    private Timestamp commentRegisterTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "article_id")
    @OnDelete(action= OnDeleteAction.CASCADE)
    private Article article;



}

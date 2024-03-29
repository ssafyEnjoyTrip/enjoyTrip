package com.example.enjoyTrip.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private int articleId;
    
    @Column(name = "title", nullable = false)
    private String title;
    
    @Column(name = "register_time")
    @CreationTimestamp
    private Timestamp registerTime;
    
    @Column(name = "content", nullable = false)
    private String content;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;

    @Column(name="heart_count")
    @ColumnDefault("0")
    private int heartCount;

    // 내가 관리하려는 Entity의 컬럼 명을 명시해줘야 한다!
    @OneToMany(mappedBy = "articleId")
    @PrimaryKeyJoinColumn
    List<ArticleFile> articleFiles = new ArrayList<>();
}

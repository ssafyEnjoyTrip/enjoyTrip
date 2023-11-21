package com.example.enjoyTrip.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ArticleFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "file_id")
    private int Id;

//    @JoinColumn(name = "article_id")
//    @OnDelete(action= OnDeleteAction.CASCADE)
//    @ManyToOne
//    private Article article;

    @Column(name = "article_id")
    private int articleId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_size")
    private long fileSize;

    @Column(name = "file_content_type")
    private String fileContentType;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "register_time")
    @CreationTimestamp
    private Timestamp registerTime;
}



package com.example.enjoyTrip.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

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

    @JoinColumn(name = "article_id")
    @ManyToOne
    private Article article;

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



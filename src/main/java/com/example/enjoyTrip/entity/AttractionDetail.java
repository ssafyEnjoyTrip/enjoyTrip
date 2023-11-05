package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
@Table(name = "attraction_detail")
public class AttractionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private Long contentId;

    @Column
    private String cat1;

    @Column
    private String cat2;

    @Column
    private String cat3;

    @Column(name = "created_time")
    private String createdTime;

    @Column(name = "modified_time")
    private String modifiedTime;

    @Column(name = "booktour")
    private String bookTour;

}

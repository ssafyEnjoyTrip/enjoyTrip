package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
@Table(name = "attraction_description")
public class AttractionDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="content_id")
    private Long contentId;

    @Column(name="homepage")
    private String homePage;

    @Column
    private String overview;

    @Column(name="telname")
    private String telName;

}
package com.example.enjoyTrip.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "attraction_detail", schema = "enjoytrip", catalog = "")
public class AttractionDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "content_id")
    private int contentId;
    @Basic
    @Column(name = "cat1")
    private String cat1;
    @Basic
    @Column(name = "cat2")
    private String cat2;
    @Basic
    @Column(name = "cat3")
    private String cat3;
    @Basic
    @Column(name = "created_time")
    private String createdTime;
    @Basic
    @Column(name = "modified_time")
    private String modifiedTime;
    @Basic
    @Column(name = "booktour")
    private String booktour;

}

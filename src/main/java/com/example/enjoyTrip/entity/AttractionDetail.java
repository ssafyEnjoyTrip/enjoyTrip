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
@javax.persistence.Table(name = "attraction_detail", schema = "enjoytrip", catalog = "")
public class AttractionDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "content_id")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttractionDetail that = (AttractionDetail) o;
        return contentId == that.contentId && Objects.equals(cat1, that.cat1) && Objects.equals(cat2, that.cat2) && Objects.equals(cat3, that.cat3) && Objects.equals(createdTime, that.createdTime) && Objects.equals(modifiedTime, that.modifiedTime) && Objects.equals(booktour, that.booktour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, cat1, cat2, cat3, createdTime, modifiedTime, booktour);
    }
}

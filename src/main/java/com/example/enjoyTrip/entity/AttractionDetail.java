package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "attraction_detail", schema = "enjoytrip", catalog = "")
public class AttractionDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "content_id")
    private int contentId;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "cat1")
    private String cat1;

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    @Basic
    @Column(name = "cat2")
    private String cat2;

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    @Basic
    @Column(name = "cat3")
    private String cat3;

    public String getCat3() {
        return cat3;
    }

    public void setCat3(String cat3) {
        this.cat3 = cat3;
    }

    @Basic
    @Column(name = "created_time")
    private String createdTime;

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "modified_time")
    private String modifiedTime;

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Basic
    @Column(name = "booktour")
    private String booktour;

    public String getBooktour() {
        return booktour;
    }

    public void setBooktour(String booktour) {
        this.booktour = booktour;
    }

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

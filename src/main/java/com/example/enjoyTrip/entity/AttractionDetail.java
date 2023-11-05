package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
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

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getCat1() {
        return cat1;
    }

    public void setCat1(String cat1) {
        this.cat1 = cat1;
    }

    public String getCat2() {
        return cat2;
    }

    public void setCat2(String cat2) {
        this.cat2 = cat2;
    }

    public String getCat3() {
        return cat3;
    }

    public void setCat3(String cat3) {
        this.cat3 = cat3;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

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

        if (contentId != that.contentId) return false;
        if (cat1 != null ? !cat1.equals(that.cat1) : that.cat1 != null) return false;
        if (cat2 != null ? !cat2.equals(that.cat2) : that.cat2 != null) return false;
        if (cat3 != null ? !cat3.equals(that.cat3) : that.cat3 != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (modifiedTime != null ? !modifiedTime.equals(that.modifiedTime) : that.modifiedTime != null) return false;
        if (booktour != null ? !booktour.equals(that.booktour) : that.booktour != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId;
        result = 31 * result + (cat1 != null ? cat1.hashCode() : 0);
        result = 31 * result + (cat2 != null ? cat2.hashCode() : 0);
        result = 31 * result + (cat3 != null ? cat3.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        result = 31 * result + (booktour != null ? booktour.hashCode() : 0);
        return result;
    }
}

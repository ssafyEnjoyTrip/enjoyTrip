package com.example.enjoyTrip.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
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

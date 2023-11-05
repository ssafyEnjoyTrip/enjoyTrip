package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "attraction_description", schema = "enjoytrip", catalog = "")
public class AttractionDescription {
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
    @Column(name = "homepage")
    private String homepage;

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Basic
    @Column(name = "overview")
    private String overview;

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Basic
    @Column(name = "telname")
    private String telname;

    public String getTelname() {
        return telname;
    }

    public void setTelname(String telname) {
        this.telname = telname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttractionDescription that = (AttractionDescription) o;
        return contentId == that.contentId && Objects.equals(homepage, that.homepage) && Objects.equals(overview, that.overview) && Objects.equals(telname, that.telname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, homepage, overview, telname);
    }
}

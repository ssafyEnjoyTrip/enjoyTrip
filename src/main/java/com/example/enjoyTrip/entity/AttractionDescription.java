package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
@Table(name = "attraction_description", schema = "enjoytrip", catalog = "")
public class AttractionDescription {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "content_id")
    private int contentId;
    @Basic
    @Column(name = "homepage")
    private String homepage;
    @Basic
    @Column(name = "overview")
    private String overview;
    @Basic
    @Column(name = "telname")
    private String telname;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

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

        if (contentId != that.contentId) return false;
        if (homepage != null ? !homepage.equals(that.homepage) : that.homepage != null) return false;
        if (overview != null ? !overview.equals(that.overview) : that.overview != null) return false;
        if (telname != null ? !telname.equals(that.telname) : that.telname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId;
        result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (telname != null ? telname.hashCode() : 0);
        return result;
    }
}

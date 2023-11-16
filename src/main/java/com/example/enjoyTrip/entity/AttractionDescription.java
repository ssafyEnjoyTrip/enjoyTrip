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
@javax.persistence.Table(name = "attraction_description", schema = "enjoytrip", catalog = "")
public class AttractionDescription {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "content_id")
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

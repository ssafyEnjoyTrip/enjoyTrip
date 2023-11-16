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
public class Bookmarks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id")
    private int id;

    @Basic
    @Column(name = "content_id")
    private int contentId;

    @Basic
    @Column(name = "user_id")
    private int userId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookmarks bookmarks = (Bookmarks) o;
        return id == bookmarks.id && contentId == bookmarks.contentId && Objects.equals(userId, bookmarks.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contentId, userId);
    }
}

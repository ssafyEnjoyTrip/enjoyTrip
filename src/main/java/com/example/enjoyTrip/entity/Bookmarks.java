package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Bookmarks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content_id")
    private int contentId;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "user_id")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

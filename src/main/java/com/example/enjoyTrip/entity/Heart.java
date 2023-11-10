package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Heart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "heart_id")
    private int heartId;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "content_id")
    private int contentId;
    @Basic
    @Column(name = "member_id")
    private Integer memberId;

    public int getHeartId() {
        return heartId;
    }

    public void setHeartId(int heartId) {
        this.heartId = heartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heart heart = (Heart) o;
        return heartId == heart.heartId && userId == heart.userId && contentId == heart.contentId && Objects.equals(memberId, heart.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heartId, userId, contentId, memberId);
    }
}

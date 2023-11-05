package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
public class Heart {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "heart_id")
    private int heartId;
    @Basic
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "content_id")
    private int contentId;

    public int getHeartId() {
        return heartId;
    }

    public void setHeartId(int heartId) {
        this.heartId = heartId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Heart heart = (Heart) o;

        if (heartId != heart.heartId) return false;
        if (memberId != heart.memberId) return false;
        if (contentId != heart.contentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = heartId;
        result = 31 * result + memberId;
        result = 31 * result + contentId;
        return result;
    }
}

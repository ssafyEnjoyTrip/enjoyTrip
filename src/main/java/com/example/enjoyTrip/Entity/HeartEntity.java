package com.example.enjoyTrip.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "heart", schema = "enjoytrip", catalog = "")
public class HeartEntity {
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
        HeartEntity that = (HeartEntity) o;
        return heartId == that.heartId && memberId == that.memberId && contentId == that.contentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heartId, memberId, contentId);
    }
}

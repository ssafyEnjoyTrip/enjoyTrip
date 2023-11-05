package com.example.enjoyTrip.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "enjoytrip", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "userID")
    private String userId;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "profileImg")
    private String profileImg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return Objects.equals(userId, that.userId) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(profileImg, that.profileImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, password, name, profileImg);
    }
}

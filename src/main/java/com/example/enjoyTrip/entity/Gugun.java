package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(com.example.enjoyTrip.entity.GugunPK.class)
public class Gugun {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "gugun_code")
    private int gugunCode;

    public int getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(int gugunCode) {
        this.gugunCode = gugunCode;
    }

    @Basic
    @Column(name = "gugun_name")
    private String gugunName;

    public String getGugunName() {
        return gugunName;
    }

    public void setGugunName(String gugunName) {
        this.gugunName = gugunName;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sido_code")
    private int sidoCode;

    public int getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(int sidoCode) {
        this.sidoCode = sidoCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gugun gugun = (Gugun) o;
        return gugunCode == gugun.gugunCode && sidoCode == gugun.sidoCode && Objects.equals(gugunName, gugun.gugunName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gugunCode, gugunName, sidoCode);
    }
}

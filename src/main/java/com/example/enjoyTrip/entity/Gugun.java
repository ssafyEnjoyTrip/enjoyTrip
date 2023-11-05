package com.example.enjoyTrip.entity;

import javax.persistence.*;

@Entity
@IdClass(GugunPK.class)
public class Gugun {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "gugun_code")
    private int gugunCode;
    @Basic
    @Column(name = "gugun_name")
    private String gugunName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sido_code")
    private int sidoCode;

    public int getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(int gugunCode) {
        this.gugunCode = gugunCode;
    }

    public String getGugunName() {
        return gugunName;
    }

    public void setGugunName(String gugunName) {
        this.gugunName = gugunName;
    }

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

        if (gugunCode != gugun.gugunCode) return false;
        if (sidoCode != gugun.sidoCode) return false;
        if (gugunName != null ? !gugunName.equals(gugun.gugunName) : gugun.gugunName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gugunCode;
        result = 31 * result + (gugunName != null ? gugunName.hashCode() : 0);
        result = 31 * result + sidoCode;
        return result;
    }
}

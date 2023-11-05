package com.example.enjoyTrip.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class GugunPK implements Serializable {
    @Column(name = "gugun_code")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gugunCode;
    @Column(name = "sido_code")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sidoCode;

    public int getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(int gugunCode) {
        this.gugunCode = gugunCode;
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

        GugunPK gugunPK = (GugunPK) o;

        if (gugunCode != gugunPK.gugunCode) return false;
        if (sidoCode != gugunPK.sidoCode) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gugunCode;
        result = 31 * result + sidoCode;
        return result;
    }
}

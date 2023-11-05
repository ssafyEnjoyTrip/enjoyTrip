package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sido {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sido_code")
    private int sidoCode;
    @Basic
    @Column(name = "sido_name")
    private String sidoName;

    public int getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(int sidoCode) {
        this.sidoCode = sidoCode;
    }

    public String getSidoName() {
        return sidoName;
    }

    public void setSidoName(String sidoName) {
        this.sidoName = sidoName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sido sido = (Sido) o;
        return sidoCode == sido.sidoCode && Objects.equals(sidoName, sido.sidoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sidoCode, sidoName);
    }
}

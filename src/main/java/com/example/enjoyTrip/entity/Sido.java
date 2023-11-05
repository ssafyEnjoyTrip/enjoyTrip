package com.example.enjoyTrip.entity;

import javax.persistence.*;

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

        if (sidoCode != sido.sidoCode) return false;
        if (sidoName != null ? !sidoName.equals(sido.sidoName) : sido.sidoName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sidoCode;
        result = 31 * result + (sidoName != null ? sidoName.hashCode() : 0);
        return result;
    }
}

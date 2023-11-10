package com.example.enjoyTrip.entity;

import java.io.Serializable;
import java.util.Objects;

public class GugunPK implements Serializable {
    private int gugunCode;
    private int sidoCode;

    public GugunPK() {}

    public GugunPK(int gugunCode, int sidoCode) {
        this.gugunCode = gugunCode;
        this.sidoCode = sidoCode;
    }

    // equals() 및 hashCode() 구현
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GugunPK that = (GugunPK) o;
        return gugunCode == that.gugunCode &&
                sidoCode == that.sidoCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gugunCode, sidoCode);
    }

}
package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@IdClass(com.example.enjoyTrip.entity.GugunPK.class)
public class Gugun {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "gugun_code")
    private int gugunCode;

    @Basic
    @Column(name = "gugun_name")
    private String gugunName;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sido_code")
    private int sidoCode;

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

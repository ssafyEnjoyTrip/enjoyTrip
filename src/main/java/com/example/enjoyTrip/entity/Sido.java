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
public class Sido {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "sido_code")
    private int sidoCode;
    @Basic
    @Column(name = "sido_name")
    private String sidoName;

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

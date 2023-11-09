package com.example.enjoyTrip.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@EqualsAndHashCode
// ToString은 일단 만들지말자 순환참조가 발생할 수 있음.
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "phone_num")
    private String phoneNum;
    @Basic
    @Column(name = "register_time")
    private Timestamp registerTime;

}

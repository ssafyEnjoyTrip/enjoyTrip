package com.example.enjoyTrip.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "member", schema = "enjoytrip", catalog = "")
public class MemberEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "member_id")
    private int memberId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "member_pwd")
    private String memberPwd;
    @Basic
    @Column(name = "phone_num")
    private String phoneNum;
    @Basic
    @Column(name = "register_time")
    private Timestamp registerTime;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMemberPwd() {
        return memberPwd;
    }

    public void setMemberPwd(String memberPwd) {
        this.memberPwd = memberPwd;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberEntity that = (MemberEntity) o;
        return memberId == that.memberId && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(memberPwd, that.memberPwd) && Objects.equals(phoneNum, that.phoneNum) && Objects.equals(registerTime, that.registerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, name, email, memberPwd, phoneNum, registerTime);
    }
}

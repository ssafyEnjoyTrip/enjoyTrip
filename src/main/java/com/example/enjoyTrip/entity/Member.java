package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Member {
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

        Member member = (Member) o;

        if (memberId != member.memberId) return false;
        if (name != null ? !name.equals(member.name) : member.name != null) return false;
        if (email != null ? !email.equals(member.email) : member.email != null) return false;
        if (memberPwd != null ? !memberPwd.equals(member.memberPwd) : member.memberPwd != null) return false;
        if (phoneNum != null ? !phoneNum.equals(member.phoneNum) : member.phoneNum != null) return false;
        if (registerTime != null ? !registerTime.equals(member.registerTime) : member.registerTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = memberId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (memberPwd != null ? memberPwd.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        result = 31 * result + (registerTime != null ? registerTime.hashCode() : 0);
        return result;
    }
}

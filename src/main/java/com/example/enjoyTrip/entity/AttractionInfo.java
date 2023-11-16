package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@javax.persistence.Table(name = "attraction_info", schema = "enjoytrip", catalog = "")
public class AttractionInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "content_id")
    private int contentId;

    @Basic
    @Column(name = "content_type_id")
    private int contentTypeId;

    @Basic
    @Column(name = "title")
    private String title;
    
    @Basic
    @Column(name = "addr1")
    private String addr1;

    @Basic
    @Column(name = "addr2")
    private String addr2;

    @Basic
    @Column(name = "zipcode")
    private String zipcode;
    @Basic
    @Column(name = "tel")
    private String tel;

    @Basic
    @Column(name = "first_image")
    private String firstImage;

    @Basic
    @Column(name = "first_image2")
    private String firstImage2;

    @Basic
    @Column(name = "readcount")
    private int readcount;


    @Basic
    @Column(name = "sido_code")
    private int sidoCode;


    @Basic
    @Column(name = "gugun_code")
    private int gugunCode;

    @Basic
    @Column(name = "latitude")
    private BigDecimal latitude;

    @Basic
    @Column(name = "longitude")
    private BigDecimal longitude;

    @Basic
    @Column(name = "mlevel")
    private String mlevel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttractionInfo that = (AttractionInfo) o;
        return contentId == that.contentId && Objects.equals(contentTypeId, that.contentTypeId) && Objects.equals(title, that.title) && Objects.equals(addr1, that.addr1) && Objects.equals(addr2, that.addr2) && Objects.equals(zipcode, that.zipcode) && Objects.equals(tel, that.tel) && Objects.equals(firstImage, that.firstImage) && Objects.equals(firstImage2, that.firstImage2) && Objects.equals(readcount, that.readcount) && Objects.equals(sidoCode, that.sidoCode) && Objects.equals(gugunCode, that.gugunCode) && Objects.equals(latitude, that.latitude) && Objects.equals(longitude, that.longitude) && Objects.equals(mlevel, that.mlevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentId, contentTypeId, title, addr1, addr2, zipcode, tel, firstImage, firstImage2, readcount, sidoCode, gugunCode, latitude, longitude, mlevel);
    }
}

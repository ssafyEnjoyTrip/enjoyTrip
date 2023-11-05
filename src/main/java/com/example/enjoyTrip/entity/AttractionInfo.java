package com.example.enjoyTrip.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "attraction_info", schema = "enjoytrip", catalog = "")
@Getter
@Setter
@EqualsAndHashCode
public class AttractionInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "content_id")
    private int contentId;
    @Basic
    @Column(name = "content_type_id")
    private Integer contentTypeId;
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
    private Integer readCount;
    @Basic
    @Column(name = "sido_code")
    private Integer sidoCode;
    @Basic
    @Column(name = "gugun_code")
    private Integer gugunCode;
    @Basic
    @Column(name = "latitude")
    private BigDecimal latitude;
    @Basic
    @Column(name = "longitude")
    private BigDecimal longitude;
    @Basic
    @Column(name = "mlevel")
    private String mlevel;

}

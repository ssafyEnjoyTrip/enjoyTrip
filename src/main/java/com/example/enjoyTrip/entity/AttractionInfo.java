package com.example.enjoyTrip.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode
@javax.persistence.Table(name = "attraction_info", schema = "enjoytrip", catalog = "")
public class AttractionInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "attraction_id")
    private int attractionId;

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

}

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

    @Column(name = "content_type_id")
    private int contentTypeId;

    @Column(name = "title")
    private String title;
    
    @Basic
    @Column(name = "addr1")
    private String addr1;

    @Column(name = "addr2")
    private String addr2;

    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "tel")
    private String tel;

    @Column(name = "first_image")
    private String firstImage;

    @Column(name = "first_image2")
    private String firstImage2;

    @Column(name = "readcount")
    private int readcount;

    @Column(name = "sido_code")
    private int sidoCode;

    @Column(name = "gugun_code")
    private int gugunCode;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @Column(name = "mlevel")
    private String mlevel;

}

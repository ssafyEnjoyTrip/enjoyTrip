package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "attraction_info")
public class AttractionInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="content_id")
    private Long contentId;

    @Column(name="content_type_id")
    private Long contentTypeId;

    @Column
    private String title;

    @Column
    private String addr1;

    @Column
    private String addr2;

    @Column(name = "zipcode")
    private String zipCode;

    @Column
    private String tel;

    @Column(name="first_image")
    private String firstImage;

    @Column(name="first_image2")
    private String firstImage2;

    @Column(name="readcount")
    private String readCount;

    @Column(name="sido_code")
    private Long sidoCode;

    @Column(name="gugun_code")
    private Long gugunCode;

    @Column
    private BigDecimal latitude;

    @Column
    private BigDecimal longitude;

    @Column
    private String mlevel;

}
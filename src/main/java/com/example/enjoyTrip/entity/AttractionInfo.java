package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@javax.persistence.Table(name = "attraction_info", schema = "enjoytrip", catalog = "")
public class AttractionInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @javax.persistence.Column(name = "content_id")
    private int contentId;

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "content_type_id")
    private Integer contentTypeId;

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    @Basic
    @Column(name = "title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "addr1")
    private String addr1;

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    @Basic
    @Column(name = "addr2")
    private String addr2;

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    @Basic
    @Column(name = "zipcode")
    private String zipcode;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "tel")
    private String tel;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "first_image")
    private String firstImage;

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    @Basic
    @Column(name = "first_image2")
    private String firstImage2;

    public String getFirstImage2() {
        return firstImage2;
    }

    public void setFirstImage2(String firstImage2) {
        this.firstImage2 = firstImage2;
    }

    @Basic
    @Column(name = "readcount")
    private Integer readcount;

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    @Basic
    @Column(name = "sido_code")
    private Integer sidoCode;

    public Integer getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(Integer sidoCode) {
        this.sidoCode = sidoCode;
    }

    @Basic
    @Column(name = "gugun_code")
    private Integer gugunCode;

    public Integer getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(Integer gugunCode) {
        this.gugunCode = gugunCode;
    }

    @Basic
    @Column(name = "latitude")
    private BigDecimal latitude;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    private BigDecimal longitude;

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "mlevel")
    private String mlevel;

    public String getMlevel() {
        return mlevel;
    }

    public void setMlevel(String mlevel) {
        this.mlevel = mlevel;
    }

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

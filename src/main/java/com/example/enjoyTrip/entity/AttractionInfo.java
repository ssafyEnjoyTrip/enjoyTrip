package com.example.enjoyTrip.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "attraction_info", schema = "enjoytrip", catalog = "")
public class AttractionInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "content_id")
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
    private Integer readcount;
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

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getFirstImage2() {
        return firstImage2;
    }

    public void setFirstImage2(String firstImage2) {
        this.firstImage2 = firstImage2;
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    public Integer getSidoCode() {
        return sidoCode;
    }

    public void setSidoCode(Integer sidoCode) {
        this.sidoCode = sidoCode;
    }

    public Integer getGugunCode() {
        return gugunCode;
    }

    public void setGugunCode(Integer gugunCode) {
        this.gugunCode = gugunCode;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

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

        if (contentId != that.contentId) return false;
        if (contentTypeId != null ? !contentTypeId.equals(that.contentTypeId) : that.contentTypeId != null)
            return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (addr1 != null ? !addr1.equals(that.addr1) : that.addr1 != null) return false;
        if (addr2 != null ? !addr2.equals(that.addr2) : that.addr2 != null) return false;
        if (zipcode != null ? !zipcode.equals(that.zipcode) : that.zipcode != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (firstImage != null ? !firstImage.equals(that.firstImage) : that.firstImage != null) return false;
        if (firstImage2 != null ? !firstImage2.equals(that.firstImage2) : that.firstImage2 != null) return false;
        if (readcount != null ? !readcount.equals(that.readcount) : that.readcount != null) return false;
        if (sidoCode != null ? !sidoCode.equals(that.sidoCode) : that.sidoCode != null) return false;
        if (gugunCode != null ? !gugunCode.equals(that.gugunCode) : that.gugunCode != null) return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (mlevel != null ? !mlevel.equals(that.mlevel) : that.mlevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = contentId;
        result = 31 * result + (contentTypeId != null ? contentTypeId.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (addr1 != null ? addr1.hashCode() : 0);
        result = 31 * result + (addr2 != null ? addr2.hashCode() : 0);
        result = 31 * result + (zipcode != null ? zipcode.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (firstImage != null ? firstImage.hashCode() : 0);
        result = 31 * result + (firstImage2 != null ? firstImage2.hashCode() : 0);
        result = 31 * result + (readcount != null ? readcount.hashCode() : 0);
        result = 31 * result + (sidoCode != null ? sidoCode.hashCode() : 0);
        result = 31 * result + (gugunCode != null ? gugunCode.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (mlevel != null ? mlevel.hashCode() : 0);
        return result;
    }
}

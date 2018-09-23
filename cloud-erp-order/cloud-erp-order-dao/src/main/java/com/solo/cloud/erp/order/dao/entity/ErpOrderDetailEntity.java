package com.solo.cloud.erp.order.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "erp_order_detail", schema = "erp", catalog = "")
public class ErpOrderDetailEntity {
    private int id;
    private String orderNo;
    private String productName;
    private String productSn;
    private String productNo;
    private int size;
    private String color;
    private int num;
    private BigDecimal realPrice;
    private BigDecimal tagPrice;
    private BigDecimal orderScore;
    private Date orderDate;
    private Integer originId;
    private byte isRefund;
    private String orderStatus;
    private String vipMobile;
    private int shopId;
    private int staffId;
    private String staffName;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_no", nullable = false, length = 32)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "product_name", nullable = false, length = 32)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_sn", nullable = false, length = 32)
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Basic
    @Column(name = "product_no", nullable = false, length = 32)
    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    @Basic
    @Column(name = "size", nullable = false)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "color", nullable = false, length = 3)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "num", nullable = false)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Basic
    @Column(name = "real_price", nullable = false, precision = 2)
    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    @Basic
    @Column(name = "tag_price", nullable = false, precision = 2)
    public BigDecimal getTagPrice() {
        return tagPrice;
    }

    public void setTagPrice(BigDecimal tagPrice) {
        this.tagPrice = tagPrice;
    }

    @Basic
    @Column(name = "order_score", nullable = false, precision = 2)
    public BigDecimal getOrderScore() {
        return orderScore;
    }

    public void setOrderScore(BigDecimal orderScore) {
        this.orderScore = orderScore;
    }

    @Basic
    @Column(name = "order_date", nullable = false)
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "origin_id", nullable = true)
    public Integer getOriginId() {
        return originId;
    }

    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    @Basic
    @Column(name = "is_refund", nullable = false)
    public byte getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(byte isRefund) {
        this.isRefund = isRefund;
    }

    @Basic
    @Column(name = "order_status", nullable = false, length = 1)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "vip_mobile", nullable = true, length = 11)
    public String getVipMobile() {
        return vipMobile;
    }

    public void setVipMobile(String vipMobile) {
        this.vipMobile = vipMobile;
    }

    @Basic
    @Column(name = "shop_id", nullable = false)
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "staff_id", nullable = false)
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "staff_name", nullable = false, length = 32)
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Basic
    @Column(name = "gmt_create", nullable = false)
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Basic
    @Column(name = "gmt_modified", nullable = false)
    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpOrderDetailEntity that = (ErpOrderDetailEntity) o;

        if (id != that.id) return false;
        if (size != that.size) return false;
        if (num != that.num) return false;
        if (isRefund != that.isRefund) return false;
        if (shopId != that.shopId) return false;
        if (staffId != that.staffId) return false;
        if (orderNo != null ? !orderNo.equals(that.orderNo) : that.orderNo != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productSn != null ? !productSn.equals(that.productSn) : that.productSn != null) return false;
        if (productNo != null ? !productNo.equals(that.productNo) : that.productNo != null) return false;
        if (color != null ? !color.equals(that.color) : that.color != null) return false;
        if (realPrice != null ? !realPrice.equals(that.realPrice) : that.realPrice != null) return false;
        if (tagPrice != null ? !tagPrice.equals(that.tagPrice) : that.tagPrice != null) return false;
        if (orderScore != null ? !orderScore.equals(that.orderScore) : that.orderScore != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (originId != null ? !originId.equals(that.originId) : that.originId != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (vipMobile != null ? !vipMobile.equals(that.vipMobile) : that.vipMobile != null) return false;
        if (staffName != null ? !staffName.equals(that.staffName) : that.staffName != null) return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModified != null ? !gmtModified.equals(that.gmtModified) : that.gmtModified != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productSn != null ? productSn.hashCode() : 0);
        result = 31 * result + (productNo != null ? productNo.hashCode() : 0);
        result = 31 * result + size;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + num;
        result = 31 * result + (realPrice != null ? realPrice.hashCode() : 0);
        result = 31 * result + (tagPrice != null ? tagPrice.hashCode() : 0);
        result = 31 * result + (orderScore != null ? orderScore.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (originId != null ? originId.hashCode() : 0);
        result = 31 * result + (int) isRefund;
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (vipMobile != null ? vipMobile.hashCode() : 0);
        result = 31 * result + shopId;
        result = 31 * result + staffId;
        result = 31 * result + (staffName != null ? staffName.hashCode() : 0);
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        return result;
    }
}

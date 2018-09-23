package com.solo.cloud.erp.order.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "erp_order_info", schema = "erp", catalog = "")
public class ErpOrderInfoEntity {
    private int id;
    private int shopId;
    private int staffId;
    private String staffName;
    private String orderNo;
    private String orderType;
    private String orderStatus;
    private String payType;
    private BigDecimal payAmount;
    private BigDecimal payScore;
    private BigDecimal totalAmount;
    private BigDecimal orderScore;
    private String remark;
    private byte isInvoice;
    private String invoiceRemark;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
    private Date orderDate;
    private int totalNum;
    private String vipMobile;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "order_no", nullable = false, length = 32)
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "order_type", nullable = false, length = 1)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
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
    @Column(name = "pay_type", nullable = false, length = 1)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "pay_amount", nullable = false, precision = 2)
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    @Basic
    @Column(name = "pay_score", nullable = false, precision = 2)
    public BigDecimal getPayScore() {
        return payScore;
    }

    public void setPayScore(BigDecimal payScore) {
        this.payScore = payScore;
    }

    @Basic
    @Column(name = "total_amount", nullable = false, precision = 2)
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
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
    @Column(name = "remark", nullable = true, length = 128)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "is_invoice", nullable = false)
    public byte getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    @Basic
    @Column(name = "invoice_remark", nullable = true, length = 64)
    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
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

    @Basic
    @Column(name = "order_date", nullable = false)
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Basic
    @Column(name = "total_num", nullable = false)
    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    @Basic
    @Column(name = "vip_mobile", nullable = true, length = 11)
    public String getVipMobile() {
        return vipMobile;
    }

    public void setVipMobile(String vipMobile) {
        this.vipMobile = vipMobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpOrderInfoEntity that = (ErpOrderInfoEntity) o;

        if (id != that.id) return false;
        if (shopId != that.shopId) return false;
        if (staffId != that.staffId) return false;
        if (isInvoice != that.isInvoice) return false;
        if (totalNum != that.totalNum) return false;
        if (staffName != null ? !staffName.equals(that.staffName) : that.staffName != null) return false;
        if (orderNo != null ? !orderNo.equals(that.orderNo) : that.orderNo != null) return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (payType != null ? !payType.equals(that.payType) : that.payType != null) return false;
        if (payAmount != null ? !payAmount.equals(that.payAmount) : that.payAmount != null) return false;
        if (payScore != null ? !payScore.equals(that.payScore) : that.payScore != null) return false;
        if (totalAmount != null ? !totalAmount.equals(that.totalAmount) : that.totalAmount != null) return false;
        if (orderScore != null ? !orderScore.equals(that.orderScore) : that.orderScore != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (invoiceRemark != null ? !invoiceRemark.equals(that.invoiceRemark) : that.invoiceRemark != null)
            return false;
        if (gmtCreate != null ? !gmtCreate.equals(that.gmtCreate) : that.gmtCreate != null) return false;
        if (gmtModified != null ? !gmtModified.equals(that.gmtModified) : that.gmtModified != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (vipMobile != null ? !vipMobile.equals(that.vipMobile) : that.vipMobile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + shopId;
        result = 31 * result + staffId;
        result = 31 * result + (staffName != null ? staffName.hashCode() : 0);
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (payType != null ? payType.hashCode() : 0);
        result = 31 * result + (payAmount != null ? payAmount.hashCode() : 0);
        result = 31 * result + (payScore != null ? payScore.hashCode() : 0);
        result = 31 * result + (totalAmount != null ? totalAmount.hashCode() : 0);
        result = 31 * result + (orderScore != null ? orderScore.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (int) isInvoice;
        result = 31 * result + (invoiceRemark != null ? invoiceRemark.hashCode() : 0);
        result = 31 * result + (gmtCreate != null ? gmtCreate.hashCode() : 0);
        result = 31 * result + (gmtModified != null ? gmtModified.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + totalNum;
        result = 31 * result + (vipMobile != null ? vipMobile.hashCode() : 0);
        return result;
    }
}

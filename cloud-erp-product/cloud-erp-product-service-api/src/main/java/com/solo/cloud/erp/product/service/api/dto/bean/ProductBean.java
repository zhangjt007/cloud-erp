package com.solo.cloud.erp.product.service.api.dto.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class ProductBean implements Serializable{

    private int id;
    private String productNo;
    private String productName;
    private int year;
    private int season;
    private int waveBand;
    private String productType;
    private String productImg;
    private String productThums;
    private String brandName;
    private BigDecimal tagPrice;
    private BigDecimal realPrice;
    private BigDecimal costPrice;
    private String size;
    private String color;
    private int discount;
    private String remark;
    private Timestamp gmtCreate;
    private Timestamp gmtModified;
}

package com.solo.cloud.erp.order.service.api.dto.bean;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CreateOrderDetailBean implements Serializable {
    @NotBlank
    private String productSn;
    @NotNull
    private Integer num;
    @NotNull
    private BigDecimal realPrice;
}
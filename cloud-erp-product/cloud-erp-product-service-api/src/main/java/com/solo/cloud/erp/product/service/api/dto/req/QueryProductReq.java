package com.solo.cloud.erp.product.service.api.dto.req;

import com.solo.cloud.erp.pub.common.pojo.base.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(value = "QueryProductReq", description = "商品条件查询")
public class QueryProductReq extends BaseReq {

    @NotBlank(message = "商品编号不能为空")
    @ApiModelProperty(value = "商品编号", required = true, example = "X821W02")
    private String productNo;

    @ApiModelProperty(value = "商品类型", allowableValues = "K,T,C,L", example = "W")
    private String productType;
}

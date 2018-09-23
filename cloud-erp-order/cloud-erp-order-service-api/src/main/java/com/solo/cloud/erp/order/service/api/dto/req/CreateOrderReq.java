package com.solo.cloud.erp.order.service.api.dto.req;

import com.solo.cloud.erp.order.service.api.dto.bean.CreateOrderDetailBean;
import com.solo.cloud.erp.pub.common.pojo.base.BaseReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ApiModel(value = "CreateOrderReq", description = "订单创建请求报文")
public class CreateOrderReq extends BaseReq {

    @NotNull(message = "订单明细不能为空")
    @ApiModelProperty(value = "订单明细", required = true)
    private List<CreateOrderDetailBean> details;
}
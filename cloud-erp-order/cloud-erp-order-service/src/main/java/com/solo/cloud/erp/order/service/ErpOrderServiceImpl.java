package com.solo.cloud.erp.order.service;

import com.solo.cloud.erp.order.service.api.dto.req.CreateOrderReq;
import com.solo.cloud.erp.order.service.api.dto.resp.CreateOrderResp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api(value = "/order", tags = "订单类接口")
public class ErpOrderServiceImpl implements IErpOrderService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    @ApiOperation(value = "订单创建", response = String.class, notes = "根据明细创建订单信息和订单明细表")
    public CreateOrderResp create(@Valid CreateOrderReq request) {
        return null;
    }
}

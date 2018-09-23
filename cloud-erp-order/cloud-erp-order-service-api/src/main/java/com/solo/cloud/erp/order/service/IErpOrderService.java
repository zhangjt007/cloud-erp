package com.solo.cloud.erp.order.service;

import com.solo.cloud.erp.order.service.api.dto.req.CreateOrderReq;
import com.solo.cloud.erp.order.service.api.dto.resp.CreateOrderResp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Validated
@RequestMapping("/order")
public interface IErpOrderService {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    CreateOrderResp create(@Valid @RequestBody CreateOrderReq request);

}

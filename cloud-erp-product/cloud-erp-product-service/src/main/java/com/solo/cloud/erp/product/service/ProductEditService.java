package com.solo.cloud.erp.product.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/product/edit", tags = "查询类接口")
@RequestMapping("/product/edit")
@RestController
public class ProductEditService {

    @ApiOperation(value = "获取商品详细信息", response = String.class, notes = "根据url传过来的款式编号获取商品详细信息")
    @ApiImplicitParam(name = "productNo", value = "款式编号", required = true, dataType = "String")
    @GetMapping("/product_no/{productNo}")
    public String insert(@PathVariable(value = "productNo") String productNo) {
        return "success";
    }
}

package com.solo.cloud.erp.inventory.service.api;

import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/inventory/query")
public interface IErpInventoryQueryService {

    @GetMapping("/product_sn/{productSn}")
    String queryByProductSn(@ApiParam(value = "商品编号", required = true) @PathVariable(value = "productSn") String productSn);
}
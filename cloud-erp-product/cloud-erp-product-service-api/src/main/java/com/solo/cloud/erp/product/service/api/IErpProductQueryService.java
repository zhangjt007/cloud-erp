package com.solo.cloud.erp.product.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/product/query")
public interface IErpProductQueryService {
    @GetMapping("/product_no/{productNo}")
    String queryByProductNo(@PathVariable(value = "productNo") String productNo);
}

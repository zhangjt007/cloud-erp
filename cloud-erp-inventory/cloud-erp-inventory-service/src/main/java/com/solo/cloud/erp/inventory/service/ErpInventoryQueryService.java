package com.solo.cloud.erp.inventory.service;

import com.solo.cloud.erp.inventory.client.ProductQueryClient;
import com.solo.cloud.erp.inventory.service.api.IErpInventoryQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 库存服务
 */
@Api(value = "/inventory/query", tags = "查询类接口")
@RestController
public class ErpInventoryQueryService implements IErpInventoryQueryService {
    private static final String SERVICENAME = "库存查询服务";

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ProductQueryClient productQueryClient;

    @ApiOperation(value = "根据商品编码查询库存信息", response = String.class, notes = "根据商品编码查询库存信息")
    @Override
    public String queryByProductSn(@PathVariable(value = "productSn") String productSn) {
        log.info("[{}]接口名称：{};开始", SERVICENAME, "queryByProductSn");
        long startTime = System.currentTimeMillis();

        String result = productQueryClient.queryByProductNo(productSn);

        log.info("[{}]接口名称：{};执行结束,耗时「{}」ms", SERVICENAME, "queryByProductSn", System.currentTimeMillis() - startTime);
        return "inventory:" + String.valueOf(productSn) + "product:" + result;
    }
}
package com.solo.cloud.erp.product.service;

import com.solo.cloud.erp.product.business.IProductQueryManager;
import com.solo.cloud.erp.product.dao.entity.ErpProductInfoEntity;
import com.solo.cloud.erp.product.dao.repository.ErpProductInfoRepository;
import com.solo.cloud.erp.product.service.api.IErpProductQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/product/query", tags = "查询类接口")
@RefreshScope
@RestController
public class ProductQueryService implements IErpProductQueryService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private static final Logger mongoLog = LoggerFactory.getLogger("MONGODB");

    @Autowired
    private ErpProductInfoRepository repository;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private IProductQueryManager productQueryManager;
    @Value("${product.sn}")
    private String productSn;

    @ApiOperation(value = "获取商品详细信息", response = String.class, notes = "根据url传过来的款式编号获取商品详细信息")
    @ApiImplicitParam(name = "productNo", value = "款式编号", required = true, dataType = "String")
    @Override
    public String queryByProductNo(@PathVariable(value = "productNo") String productNo) {
        log.info("[商品模块]接口名称：{};开始", "queryByProductNo");
        mongoLog.info("[商品模块]接口名称：{};开始", "queryByProductNo");
        long startTime = System.currentTimeMillis();
        //Mysql查询
        ErpProductInfoEntity entity = repository.findByProductNo(productSn);
        productQueryManager.queryByProductSn(productNo);
        //redis set
        redisTemplate.opsForValue().set(entity.getProductNo(), entity.getProductName());
        log.info("[商品模块]接口名称：{};执行结束,耗时「{}」ms", "queryByProductNo", System.currentTimeMillis() - startTime);
        return String.valueOf(entity.getProductName());
    }
}

package com.solo.cloud.erp.inventory.client;

import com.solo.cloud.erp.inventory.client.fallback.ProductQueryFallBackFactory;
import com.solo.cloud.erp.product.service.api.IErpProductQueryService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 此处使用fallbackFactory而不使用fallback的理由：导致url重复注册
 */
@FeignClient(value = "cloud-erp-product", fallbackFactory = ProductQueryFallBackFactory.class)
public interface ProductQueryClient extends IErpProductQueryService {

}

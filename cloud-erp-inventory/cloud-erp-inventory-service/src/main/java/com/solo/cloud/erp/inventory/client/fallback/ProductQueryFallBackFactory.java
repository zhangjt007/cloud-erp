package com.solo.cloud.erp.inventory.client.fallback;

import com.solo.cloud.erp.inventory.client.ProductQueryClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ProductQueryFallBackFactory implements FallbackFactory<ProductQueryClient> {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public ProductQueryClient create(Throwable throwable) {
        log.info("fallback reason was: {}", throwable.getCause());
        return new ProductQueryClient() {
            @Override
            public String queryByProductNo(@PathVariable("productNo") String productNo) {
                return "fall back";
            }
        };
    }
}
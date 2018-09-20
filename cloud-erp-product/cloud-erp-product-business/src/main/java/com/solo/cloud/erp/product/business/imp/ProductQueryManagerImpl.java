package com.solo.cloud.erp.product.business.imp;

import com.solo.cloud.erp.product.business.IProductQueryManager;
import com.solo.cloud.erp.product.dao.entity.ErpProductInfoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductQueryManagerImpl implements IProductQueryManager {
    @Override
    public ErpProductInfoEntity queryByProductSn(String productSn) {
        return new ErpProductInfoEntity();
    }
}

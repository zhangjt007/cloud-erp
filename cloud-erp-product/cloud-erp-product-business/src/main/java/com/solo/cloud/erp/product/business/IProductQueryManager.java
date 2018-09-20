package com.solo.cloud.erp.product.business;

import com.solo.cloud.erp.product.dao.entity.ErpProductInfoEntity;

public interface IProductQueryManager {

    ErpProductInfoEntity queryByProductSn(String productSn);
    
}

package com.solo.cloud.erp.product.business;

import com.solo.cloud.erp.product.dao.entity.ErpProductInfoEntity;

import java.util.List;

public interface IProductQueryManager {

    ErpProductInfoEntity queryByProductNo(String productNo);

    List<ErpProductInfoEntity> query(ErpProductInfoEntity entity);
}

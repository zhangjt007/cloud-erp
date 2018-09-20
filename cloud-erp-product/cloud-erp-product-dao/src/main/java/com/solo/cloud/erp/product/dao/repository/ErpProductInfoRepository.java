package com.solo.cloud.erp.product.dao.repository;

import com.solo.cloud.erp.product.dao.entity.ErpProductInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErpProductInfoRepository extends JpaRepository<ErpProductInfoEntity, Integer> {

    ErpProductInfoEntity findByProductNo(String productNo);

}


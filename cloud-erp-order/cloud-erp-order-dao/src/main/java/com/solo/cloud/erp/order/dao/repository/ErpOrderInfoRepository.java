package com.solo.cloud.erp.order.dao.repository;

import com.solo.cloud.erp.order.dao.entity.ErpOrderInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErpOrderInfoRepository extends JpaRepository<ErpOrderInfoEntity, Integer> {

    ErpOrderInfoEntity findByOrderNo(String orderNo);

}

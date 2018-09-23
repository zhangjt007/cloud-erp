package com.solo.cloud.erp.order.dao.repository;

import com.solo.cloud.erp.order.dao.entity.ErpOrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ErpOrderDetailRepository extends JpaRepository<ErpOrderDetailEntity, Integer> {

    public List<ErpOrderDetailEntity> findByOrderNo(String orderNo);

}

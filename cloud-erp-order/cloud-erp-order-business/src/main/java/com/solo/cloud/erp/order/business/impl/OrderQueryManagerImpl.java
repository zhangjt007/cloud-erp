package com.solo.cloud.erp.order.business.impl;

import com.solo.cloud.erp.order.business.IOrderQueryManager;
import com.solo.cloud.erp.order.dao.entity.ErpOrderDetailEntity;
import com.solo.cloud.erp.order.dao.entity.ErpOrderInfoEntity;
import com.solo.cloud.erp.order.dao.repository.ErpOrderDetailRepository;
import com.solo.cloud.erp.order.dao.repository.ErpOrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderQueryManagerImpl implements IOrderQueryManager {

    @Autowired
    private ErpOrderInfoRepository orderInfoRepository;

    @Autowired
    private ErpOrderDetailRepository orderDetailRepository;

    @Override
    public ErpOrderInfoEntity queryOrderInfoById(String orderNo) {
        return orderInfoRepository.findByOrderNo(orderNo);
    }

    @Override
    public List<ErpOrderDetailEntity> queryOrderDetailById(String orderNo) {
        return orderDetailRepository.findByOrderNo(orderNo);
    }
}

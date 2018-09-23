package com.solo.cloud.erp.order.business.impl;

import com.solo.cloud.erp.order.business.IOrderManager;
import com.solo.cloud.erp.order.dao.entity.ErpOrderDetailEntity;
import com.solo.cloud.erp.order.dao.entity.ErpOrderInfoEntity;
import com.solo.cloud.erp.order.dao.repository.ErpOrderDetailRepository;
import com.solo.cloud.erp.order.dao.repository.ErpOrderInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderManagerImpl implements IOrderManager {

    @Autowired
    private ErpOrderInfoRepository orderInfoRepository;

    @Autowired
    private ErpOrderDetailRepository orderDetailRepository;

    @Override
    @Transactional
    public void createOrderAndDetail(ErpOrderInfoEntity info, List<ErpOrderDetailEntity> details) {
        orderInfoRepository.save(info);
        orderDetailRepository.saveAll(details);
    }
}

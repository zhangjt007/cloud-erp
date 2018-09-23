package com.solo.cloud.erp.order.business;

import com.solo.cloud.erp.order.dao.entity.ErpOrderDetailEntity;
import com.solo.cloud.erp.order.dao.entity.ErpOrderInfoEntity;

import java.util.List;

public interface IOrderQueryManager {

    /**
     * 根据订单号查询订单信息
     * @param orderNo
     * @return
     */
    ErpOrderInfoEntity queryOrderInfoById(String orderNo);

    /**
     * 根据订单号查询订单明细
     * @param orderNo
     * @return
     */
    List<ErpOrderDetailEntity> queryOrderDetailById(String orderNo);
}

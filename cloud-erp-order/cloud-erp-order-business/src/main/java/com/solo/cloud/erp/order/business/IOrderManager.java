package com.solo.cloud.erp.order.business;

import com.solo.cloud.erp.order.dao.entity.ErpOrderDetailEntity;
import com.solo.cloud.erp.order.dao.entity.ErpOrderInfoEntity;

import java.util.List;

public interface IOrderManager {

    void createOrderAndDetail(ErpOrderInfoEntity info, List<ErpOrderDetailEntity> details);

}

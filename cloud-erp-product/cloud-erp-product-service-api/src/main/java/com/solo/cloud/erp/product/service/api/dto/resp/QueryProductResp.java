package com.solo.cloud.erp.product.service.api.dto.resp;

import com.solo.cloud.erp.product.service.api.dto.bean.ProductBean;
import com.solo.cloud.erp.pub.common.pojo.base.BaseResp;
import lombok.Data;

import java.util.List;

@Data
public class QueryProductResp extends BaseResp {
    private List<ProductBean> data;
}

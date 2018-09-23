package com.solo.cloud.erp.product.service.api;

import com.solo.cloud.erp.product.service.api.dto.req.QueryProductReq;
import com.solo.cloud.erp.product.service.api.dto.resp.QueryProductResp;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Validated
@RequestMapping("/product/query")
public interface IErpProductQueryService {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    QueryProductResp query(@Valid @RequestBody QueryProductReq request);

}

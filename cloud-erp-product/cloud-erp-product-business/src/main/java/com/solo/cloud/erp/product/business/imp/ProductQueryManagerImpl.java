package com.solo.cloud.erp.product.business.imp;

import com.solo.cloud.erp.product.business.IProductQueryManager;
import com.solo.cloud.erp.product.dao.entity.ErpProductInfoEntity;
import com.solo.cloud.erp.product.dao.repository.ErpProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductQueryManagerImpl implements IProductQueryManager {

    @Autowired
    private ErpProductInfoRepository productInfoRepository;

    @Override
    public ErpProductInfoEntity queryByProductNo(String productNo) {
        return productInfoRepository.findByProductNo(productNo);
    }

    @Override
    public List<ErpProductInfoEntity> query(ErpProductInfoEntity entity) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreNullValues()
                .withIgnorePaths("id", "year", "season", "waveBand", "discount");//忽略属性：是否关注。因为是基本类型，需要忽略掉
        Example example = Example.of(entity, matcher);
        return productInfoRepository.findAll(example);
    }
}

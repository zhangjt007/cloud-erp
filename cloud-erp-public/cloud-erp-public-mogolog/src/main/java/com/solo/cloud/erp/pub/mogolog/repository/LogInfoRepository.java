package com.solo.cloud.erp.pub.mogolog.repository;

import com.solo.cloud.erp.pub.mogolog.entity.LogInfoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogInfoRepository extends MongoRepository<LogInfoEntity, String> {
}

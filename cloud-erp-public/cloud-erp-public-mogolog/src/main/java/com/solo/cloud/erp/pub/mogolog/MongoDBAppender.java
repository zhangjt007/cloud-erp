package com.solo.cloud.erp.pub.mogolog;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import com.solo.cloud.erp.pub.mogolog.entity.LogInfoEntity;
import com.solo.cloud.erp.pub.mogolog.repository.LogInfoRepository;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 日志处理类
 */
@Component
public class MongoDBAppender extends UnsynchronizedAppenderBase<LoggingEvent> implements ApplicationContextAware {
    private static LogInfoRepository logInfoRepository;

    @Override
    protected void append(LoggingEvent loggingEvent) {
        LogInfoEntity myLog = new LogInfoEntity();
        myLog.setLevel(loggingEvent.getLevel().toString());
        myLog.setMsg(loggingEvent.getFormattedMessage());
        myLog.setThread(loggingEvent.getThreadName());
        myLog.setTs(new Date(loggingEvent.getTimeStamp()));
        logInfoRepository.save(myLog);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (applicationContext.getAutowireCapableBeanFactory().getBean(LogInfoRepository.class) == null) {
            logInfoRepository = applicationContext.getAutowireCapableBeanFactory().getBean(LogInfoRepository.class);
        }
    }
}

package com.solo.cloud.erp.product.base.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Order(5)
@Component
public class WebLogAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.solo.cloud.erp.product.service.*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        startTime.set(System.currentTimeMillis());
        // 记录下请求内容
        logger.info("[商品模块] URL : " + request.getRequestURL().toString());
        logger.info("[商品模块] HTTP_METHOD : " + request.getMethod());
        logger.info("[商品模块] IP : " + request.getRemoteAddr());
        logger.info("[商品模块] CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        logger.info("[商品模块] ARGS : " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable {
        // 处理完请求，返回内容
        logger.info("[商品模块] RESPONSE : " + ret);
        logger.info("[商品模块] SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }

    //后置异常通知
    @AfterThrowing("webLog()")
    public void throwss(JoinPoint jp) {
        logger.error("[商品模块] 方法异常时执行.....");
    }

}
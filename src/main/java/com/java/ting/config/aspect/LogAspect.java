package com.java.ting.config.aspect;


import com.google.gson.Gson;
import com.java.ting.domain.SysLog;
import com.java.ting.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * 日志拦截器
 *
 * @author tingOu
 */
@Aspect
@Configuration
@Slf4j
public class LogAspect {
    @Autowired
    private SysLogService sysLogService;

    Gson gson = new Gson();

    @Pointcut("execution(public *  com.java.ting.controller..*.*(..))")
    public void webLog() {
    }

    @Before("webLog()")
    public Object doTest(ProceedingJoinPoint joinPoint) {
        Object a = null;

        return "test";

    }

    @Around("webLog()")
    public Object doBefore(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("开始切面--->");
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long time = System.currentTimeMillis() - startTime;
        log.info("总共用时,time:{}", time);
        // 保存日志信息
        saveLog(joinPoint, time);
        log.info(gson.toJson(result));
        return result;

    }

    /**
     * 日志保存
     *
     * @param joinPoint
     * @param time      用时
     */
    private void saveLog(ProceedingJoinPoint joinPoint, Long time) throws Throwable {
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            SysLog sysLog = new SysLog();
            HttpServletRequest request = attributes.getRequest();
            // 记录下请求内容
            log.info("URL : " + request.getRequestURL().toString());
            sysLog.setUrl(request.getRequestURL().toString());
            log.info("HTTP_METHOD : " + request.getMethod());
            sysLog.setMethod(request.getMethod());
            log.info("IP : " + request.getRemoteAddr());
            sysLog.setReqIP(request.getRemoteAddr());
            log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            sysLog.setClassMethod(joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
            log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
            sysLog.setResData(Arrays.toString(joinPoint.getArgs()));
            sysLog.setTime(time);
            sysLog.setResultData(joinPoint.proceed().toString());
            sysLogService.insertSysLog(sysLog);

        }
    }
}

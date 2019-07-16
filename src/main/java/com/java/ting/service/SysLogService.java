package com.java.ting.service;

import com.google.gson.Gson;
import com.java.ting.domain.SysLog;
import com.java.ting.mapper.SysLogMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 日志保存
 *
 * @author tingOu
 */
@Service
@Slf4j
public class SysLogService {
    private static Gson gson = new Gson();

    @Autowired
    private SysLogMapper sysLogMapper;

    /**
     * 保存日志信息
     *
     * @param sysLog
     * @return
     */
    public void insertSysLog(SysLog sysLog) {
        log.info("保存日志信息; 入参: {}", gson.toJson(sysLog));
        try {
            sysLogMapper.insert(sysLog);
        } catch (Exception e) {
            log.error("保存日志信息错误; 错误信息: {}", e);
            e.printStackTrace();
        }

        log.info("保存日志信息成功");
    }
}

package com.java.ting.service;

import com.google.gson.Gson;
import com.java.ting.entity.SysLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 日志保存
 *
 * @author tingOu
 */
@Service
@Slf4j
public class SysLogService {
    Gson gson = new Gson();

    public Integer insertSysLog(SysLog sysLog) {

        log.info(gson.toJson(sysLog));
        return 0;
    }
}

package com.java.ting.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义redis健康检查
 *
 * @author tingOu
 * @date 2019年6月16
 */
@Component
public class RedisHealthIndicator implements HealthIndicator {

    /**
     * 默认不检查
     *
     * @return
     */
    @Override
    public Health health() {
        return Health.up().build();
    }
}

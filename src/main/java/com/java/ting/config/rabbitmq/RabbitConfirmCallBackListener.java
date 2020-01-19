package com.java.ting.config.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.stereotype.Service;

/**
 * rabbit返回机制
 *
 * @author LISHUANG
 * @date 2020/1/19
 */
@Slf4j
@Service
public class RabbitConfirmCallBackListener implements ConfirmCallback {

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        log.info("rabbit确认回调：correlationData-{}, ack-{},cause-{}", correlationData, ack, cause);
    }

}

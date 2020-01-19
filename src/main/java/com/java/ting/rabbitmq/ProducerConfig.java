package com.java.ting.rabbitmq;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * 生产者配置
 *
 * @author LISHUANG
 * @date 2020/1/16
 */
@Slf4j
@Component
public class ProducerConfig implements RabbitTemplate.ConfirmCallback {

    /**
     * 回调
     *
     * @param correlationData
     * @param b
     * @param s
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {
        log.info("rabbitmq回调第一个参数：{}，第二个参数：{}，第三个参数：{}", JSON.toJSON(correlationData), b, s);


    }
}

package com.java.ting.rabbitmq;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者配置
 *
 * @author LISHUANG
 * @date 2020/1/16
 */
@Component
@Slf4j
@RabbitListener(queues = {"${rabbitmq-test-queues}", "${rabbitmq-test-queues1}"},
        containerFactory = "rabbitListenerContainerFactory")
public class ConsumerConfig {

    /**
     * 消费者 消费队列为ting-queues的信息
     *
     * @param payload 传送的数据
     * @param channel 通道
     * @param message 具体信息
     */
    @RabbitHandler
    public void process(String payload, Channel channel, Message message) {
        log.info("获取生产者传输的需要消费的数据：{}", payload);
    }
}

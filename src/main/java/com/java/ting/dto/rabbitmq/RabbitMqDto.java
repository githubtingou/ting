package com.java.ting.dto.rabbitmq;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * rabbitmq 信息发送类
 *
 * @author LISHUANG
 * @date 2020/1/17
 */
@Getter
@Setter
@Accessors(chain = true)
public class RabbitMqDto {

    /**
     * 交换机名称
     */
    private String exchangeName;

    /**
     * 队列
     */
    private String queueName;

    /**
     * 发送的消息
     */
    private Object msg;

}

package com.java.ting.controller.web.rabbitmq;

import com.alibaba.fastjson.JSON;
import com.java.ting.dto.rabbitmq.RabbitMqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rabbitmq测试类
 *
 * @author LISHUANG
 * @date 2020/1/16
 */
@RestController
@RequestMapping(value = "/web")
@Api
@Slf4j
public class RabbitmqController {

    @Autowired
    private RabbitTemplate rabbitMqTemplate;

    @PostMapping(value = "/send/message")
    @ApiOperation(value = "rabbitmq发送数据", notes = "rabbitmq")
    public void sendMessage(@RequestBody RabbitMqDto rabbitMqDto) {
        log.info("rabbitmq发送消息入参{}", JSON.toJSON(rabbitMqDto));
        //将消息msg发送到交换机ting-queues上
        rabbitMqTemplate.convertAndSend(rabbitMqDto.getExchangeName(), rabbitMqDto.getQueueName(), JSON.toJSONString(rabbitMqDto.getMsg()));
        log.info("successfully send to queue [{}], msg [{}]", rabbitMqDto.getQueueName(), rabbitMqDto.getMsg());

    }

}

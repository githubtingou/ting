package com.java.ting.config.rabbitmq;

import com.alibaba.fastjson.JSON;
import domain.Teacher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * 失败后return回调
 *
 * @author LISHUANG
 * @date 2020/1/19
 */
@Slf4j
@Service
public class RabbitReturnCallBackListener implements RabbitTemplate.ReturnCallback {

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        log.info("rabbit失败后return回调,message-{},replyCode-{},replyText-{},exchange-{},routingKey-{}",
                JSON.toJSONString(message.getBody()), replyCode, replyText, exchange);
    }

}

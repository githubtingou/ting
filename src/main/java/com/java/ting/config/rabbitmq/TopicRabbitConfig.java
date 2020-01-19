//package com.java.ting.config.rabbitmq;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * rabbitmq Topic模式
// *
// * @author LISHUANG
// * @date 2020/1/17
// */
//@Configuration
//public class TopicRabbitConfig {
//    //绑定键
//    public final static String Q_TEST = "ting-qtest";
//    public final static String QUEUES = "ting-queues";
//
//    @Bean
//    public Queue firstQueue() {
//        return new Queue(Q_TEST);
//    }
//
//    @Bean
//    public Queue secondQueue() {
//        return new Queue(QUEUES);
//    }
//
//    @Bean
//    TopicExchange exchange() {
//        return new TopicExchange("tingou-exchange");
//    }
//
//
//    //将firstQueue和tingou-exchange绑定,而且绑定的键值为ting-qtest
//    //这样只要是消息携带的路由键是ting-qtest,才会分发到该队列
//    @Bean
//    Binding bindingExchangeMessage() {
//        return BindingBuilder.bind(firstQueue()).to(exchange()).with(Q_TEST);
//    }
//
//    //将secondQueue和tingou-exchange绑定,而且绑定的键值为用上通配路由键规则topic.#
//    // 这样只要是消息携带的路由键是以topic.开头,都会分发到该队列
//    @Bean
//    Binding bindingExchangeMessage2() {
//        return BindingBuilder.bind(secondQueue()).to(exchange()).with("ting-#");
//    }
//
//}
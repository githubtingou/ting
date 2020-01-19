package com.java.ting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * spring boot 启动类
 *
 * @author TingOu
 */
@MapperScan("com.java.ting")
@SpringBootApplication
@EnableSwagger2
public class TingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TingApplication.class, args);
    }

}

package com.java.ting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类
 *
 * @author TingOu
 */
@MapperScan("com.java.ting")
@SpringBootApplication
public class TingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TingApplication.class, args);
    }

}

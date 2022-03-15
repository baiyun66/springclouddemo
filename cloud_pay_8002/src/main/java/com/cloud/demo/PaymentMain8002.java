package com.cloud.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 24629
 * @Description
 * @create 2022-03-11 10:43
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cloud.demo.mapper")
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}

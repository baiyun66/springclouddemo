package com.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 24629
 * @Description
 * @create 2022-03-13 13:26
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {


    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}

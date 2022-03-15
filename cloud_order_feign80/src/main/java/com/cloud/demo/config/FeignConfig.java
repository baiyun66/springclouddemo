package com.cloud.demo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 24629
 * @Description
 * @create 2022-03-15 23:02
 */
@Configuration
public class FeignConfig {
    /**
     * NONE,
     * BASIC,
     * HEADERS,
     * FULL;
     * <p>
     * 日志级别
     *
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

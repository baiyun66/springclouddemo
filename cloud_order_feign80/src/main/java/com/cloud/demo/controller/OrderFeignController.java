package com.cloud.demo.controller;

import com.cloud.demo.bean.CommonResult;
import com.cloud.demo.bean.Payment;
import com.cloud.demo.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 24629
 * @Description
 * @create 2022-03-15 22:53
 */
//@RestController
//@Slf4j
//@RequestMapping("consumer")
//public class OrderFeignController {
//    @Resource
//    private PaymentFeignService paymentFeignService;
//
//    @GetMapping(value = "/consumer/payment/get/{id}")
//    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
//        return paymentFeignService.getPaymentById(id);
//    }
//
//    @GetMapping(value = "/payment/feign/timeout")
//    public String paymentFeignTimeout() {
//        // OpenFeign客户端一般默认等待1秒钟
//        return paymentFeignService.paymentFeignTimeout();
//    }
//
//
//}
@RestController
@RequestMapping("consumer")
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // OpenFeign客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }
}

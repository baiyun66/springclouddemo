package com.cloud.demo.service;

import com.cloud.demo.bean.CommonResult;
import com.cloud.demo.bean.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 24629
 * @Description
 * @create 2022-03-15 22:50
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT")
public interface PaymentFeignService {
//
//    @GetMapping(value = "/payment/get/{id}")
//    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
//
//
//    @GetMapping(value = "/payment/feign/timeout")
//    String paymentFeignTimeout();

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}

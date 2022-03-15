package com.cloud.demo.controller;

import com.cloud.demo.bean.CommonResult;
import com.cloud.demo.bean.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 24629
 * @Description
 * @create 2022-03-13 10:40
 */
@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-HYSTRIX-PAYMENT";

    @Resource
    private RestTemplate restTemplate;


    @PostMapping(value = "/consumer/payment/creat")
    public CommonResult<Payment> paymentCommonResult(@RequestBody Payment payment){
        log.info(payment.toString());
        return restTemplate.postForObject(PAYMENT_URL+"/payment/creat",payment,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> GetPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/getForEntity/{id}")
    public CommonResult<Payment> GetPayment2(@PathVariable Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult<>(444,"操作失败");
        }
    }





}

package com.cloud.demo.controller;

import com.cloud.demo.bean.CommonResult;
import com.cloud.demo.bean.Payment;
import com.cloud.demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author 24629
 * @Description
 * @create 2022-03-13 10:40
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    /**
     *
     * @param
     */
    @PostMapping("/payment/creat")
    public CommonResult CreatPayment(@RequestBody Payment payment){
        boolean row = paymentService.saveOrUpdate(payment);
        if(row){
            return new CommonResult(200,"插入成功");
        }else {
            return new CommonResult(444,"插入失败");
        }
    }

    /**
     *
     * @param id
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getById(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功,使用："+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败，使用："+serverPort,null);
        }

    }

    @GetMapping("/payment/feign/timeout")
    public String getFeignTimeOut() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}

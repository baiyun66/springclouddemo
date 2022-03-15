package com.cloud.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.demo.bean.Payment;
import com.cloud.demo.service.PaymentService;
import com.cloud.demo.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

/**
* @author 24629
* @description 针对表【payment(支付表)】的数据库操作Service实现
* @createDate 2022-03-13 10:36:09
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

}





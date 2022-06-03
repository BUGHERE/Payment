package com.cozyy.payment.service.impl;

import com.cozyy.payment.entity.PaymentInfo;
import com.cozyy.payment.mapper.PaymentInfoMapper;
import com.cozyy.payment.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}

package com.cozyy.payment.service.impl;

import com.cozyy.payment.entity.OrderInfo;
import com.cozyy.payment.mapper.OrderInfoMapper;
import com.cozyy.payment.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}

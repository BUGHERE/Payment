package com.cozyy.payment.service.impl;

import com.cozyy.payment.entity.Product;
import com.cozyy.payment.mapper.ProductMapper;
import com.cozyy.payment.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}

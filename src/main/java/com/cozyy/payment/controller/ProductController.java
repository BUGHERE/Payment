package com.cozyy.payment.controller;

import com.cozyy.payment.entity.Product;
import com.cozyy.payment.service.ProductService;
import com.cozyy.payment.valueobject.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Api(tags = "商品管理")  // Swagger2 ui
@RestController  // 保证以json格式返回
@RequestMapping("api/product")
public class ProductController {
    @ApiOperation("测试接口")  // Swagger2 ui
    @GetMapping("/test")
    public R test() {
        /***
         * test for web request
         * visited by http://localhost:8090/api/product/test
         */
        return R.ok();
    }
    @ApiOperation("/addTime func")
    @GetMapping("/addTime")
    public R addTime() {
        /**
         * add time message to R object and return R
         */
        return R.ok().data("time", new Date());
    }

    // using MyBatisPlus
    @Resource
    private ProductService productService;

    @ApiOperation("商品列表")
    @GetMapping("/list")
    public R list() {
        List<Product> list = productService.list();
        return R.ok().data("productList", list);
    }
}

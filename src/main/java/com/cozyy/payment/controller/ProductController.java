package com.cozyy.payment.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "商品管理")  // Swagger2 ui
@RestController  // 保证以json格式返回
@RequestMapping("api/product")
public class ProductController {
    @ApiOperation("测试接口")  // Swagger2 ui
    @GetMapping("/test")
    public String test() {
        /***
         * test for web request
         * visited by http://localhost:8090/api/product/test
         */
        return "test";
    }
}

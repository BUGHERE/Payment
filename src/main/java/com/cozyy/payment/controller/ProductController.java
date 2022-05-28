package com.cozyy.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 保证以json格式返回
@RequestMapping("api/product")
public class ProductController {
    @GetMapping("/test")
    public String test() {
        /***
         * test for web request
         * visited by http://localhost:8090/api/product/test
         */
        return "test";
    }
}

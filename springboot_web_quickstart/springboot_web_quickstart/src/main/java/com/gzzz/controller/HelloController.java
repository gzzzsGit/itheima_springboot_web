package com.gzzz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: HelloController
 * Package : com.gzzz.controller
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/24 22:20
 * @Version 1.0
 */
//请求处理类
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello World!";
    }
}

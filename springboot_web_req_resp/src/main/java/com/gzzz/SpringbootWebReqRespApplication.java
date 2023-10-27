package com.gzzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = "com.gzzz","java下其他包") //手动更改扫描范围 ，不建议
@SpringBootApplication //包含ComponentScan注解，具有包扫描作用，默认Beam扫描范围为当前包及其子包
public class SpringbootWebReqRespApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebReqRespApplication.class, args);
    }

}

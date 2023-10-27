package com.gzzz.controller;

import com.gzzz.pojo.Address;
import com.gzzz.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试响应数据
 */
    /**TODO:掌握@ResponseBody注解
     *  将方法返回值直接响应，如果返回值类型是实体对象/集合，将会转换为JSON格式响应
     */

/**
 * 返回的类型不一致给前端造成很大麻烦，需要设置统一的响应值类型Result
 */

@RestController
public class ResponseController {
//
//    @RequestMapping("/hello")
//    public String hello(){
//        System.out.println("Hello World ~");
//        return "Hello World ~";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr(){
//        Address addr = new Address();
//        addr.setProvince("广东");
//        addr.setCity("深圳");
//        return addr; /*   {
//                         "province": "广东",
//                         "city": "深圳"
//                                     }*/
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr(){
//        List<Address> list = new ArrayList<>();
//
//        Address addr = new Address();
//        addr.setProvince("广东");
//        addr.setCity("深圳");
//
//        Address addr2 = new Address();
//        addr2.setProvince("陕西");
//        addr2.setCity("西安");
//
//        list.add(addr);
//        list.add(addr2);
//        return list;
//    }


    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("Hello World ~");
        //return new Result(1,"success","Hello World ~");
        return Result.success("Hello World ~");
    }

    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address> list = new ArrayList<>();

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}

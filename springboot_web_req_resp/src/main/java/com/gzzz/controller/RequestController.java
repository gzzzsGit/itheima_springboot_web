package com.gzzz.controller;

import org.apache.coyote.ActionHook;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import com.gzzz.pojo.User;

import javax.management.ValueExp;
import java.time.LocalDateTime;
import java.util.*;

/**
 * className: RequestController
 * Package : com.gzzz.controller
 * Description:
 * TODO:
 *     简单参数传递
 *
 * @Author gzzz
 * @Create 2023/10/25 10:01
 * @Version 1.0
 */


@RestController
public class RequestController {
    //原始方式
    /**TODO:
     *  Controller方法形参中声明HttpServletRequest对象
     *  调用对象的getParameter(参数名)
     */


//    @RequestMapping(value = "/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//
//        Integer ageInt = Integer.parseInt(age);
//        System.out.println(name+':'+ageInt);
//
//        return "OK";
//    }

    /**
     * TODO:
     *     springboot方式：参数名和形参变量名相同，定义形参接收参数
     *     会自动进行类型转换
     */

//    @RequestMapping(value = "/simpleParam")
//    public String simpleParam(String name, int age) {
//        System.out.println(name + ':' + age);
//        return "OK";
//    }

    //如果前端请求的参数名"name"和这里定义的形参名"username"不同，需要添加注解RequestParam指定前端传递的参数名为name，从而映射到username
    @RequestMapping(value = "/simpleParam")
    //注意：@RequestParam中的required属性默认为true，代表该请求参数必须传递，如果不传递将报错。如果该参数是可选的，可以将required属性设置为false。
    public String simpleParam(@RequestParam(name = "name", required = false) String username, Integer age) {
        System.out.println("username:" + username + " age:" + age);
        return "OK";
    }

    //实体对象参数
    // 规则:请求参数名与形参对象属性名相同，即可直接通过POJO接收
    @RequestMapping(value = "/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping(value = "/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }

    //数组集合参数

    //请求参数名与形参集合名称相同且请求参数为多个,可以直接用数组接收
    @RequestMapping(value = "/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));//[java, python, go]
        return "ok";
    }

    //请求参数名与形参集合名称相同且请求参数为多个，通过@RequestParam绑定参数关系来使用集合接收
    @RequestMapping(value = "/collectionParam")
    public String collectionParam(@RequestParam ArrayList<String> hobby) {
        hobby.sort(String::compareTo);
        System.out.println(hobby);//[go, java, python]
        return "ok";
    }

    //日期参数
    @RequestMapping(value = "/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date) {
        System.out.println(date);
        return "ok";
    }

    //json格式参数
    @RequestMapping(value = "/jsonParam")
    //json格式须要使用@RequestBody注解！
    public String jsonParam(@RequestBody User user) {
        System.out.println(user);
        return "ok";
    }

    //路径参数,使用{xx}映射，并使用同名形参接收
    @RequestMapping(value = "/path/{id}")
    //注意:使用@PathVariable绑定参数关系
    public String pathParam(@PathVariable int id) {
        System.out.println(id);
        return "ok";
    }

    //多个路径参数,使用/隔开
    @RequestMapping(value = "/path/{id}/{name}")
    //注意:使用@PathVariable绑定参数关系
    public String pathParam(@PathVariable Integer id, @PathVariable String name) {
        System.out.println(id + ":" + name);
        return "ok";
    }
}




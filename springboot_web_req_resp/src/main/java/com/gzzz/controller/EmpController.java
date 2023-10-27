package com.gzzz.controller;

import com.gzzz.pojo.Emp;
import com.gzzz.pojo.Result;
import com.gzzz.service.EmpService;
import com.gzzz.service.impl.EmpServiceA;
import com.gzzz.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * className: EmpController
 * Package : com.gzzz.controller
 * Description:
 * TODO:
 *      接受请求，返回数据
 * TODO；
 *      依赖注入的注解：@Autowired
 *          如果同类型的注解有多个：是spring框架提供的注解，按照类型注入
 *              1.@Primary 在要生效的Bean上加上该注解
 *              2.在@Autowired 上加 @ qualifier("Bean的名称")  ——默认是类名小写
 *              3.用@Resource(name = Bean的名称) 替换 @Autowired  ——是jdk提供的注解，按照名称注入
 *
 * @Author gzzz
 * @Create 2023/10/26 0:28
 * @Version 1.0
 */
//控制器只能使用@Controller注解，不能使用@Component注解
//@Controller 可以省略，因为@RestController = @Controller + @ResponseBody
@RestController(value = "Controller1") //所以已经把EmpController交给了IOC容器管理
public class EmpController {
    @Qualifier("Service1")
    @Autowired //运行时，IOC容器会提供该类型的Bean对象，并赋值给该变量–依赖注入
    //Resource(name = "Service1")
    private EmpService service ;

    @RequestMapping("/listEmp")
    public Result getEmp() {
        //1.调用service层方法获取数据
        List<Emp> emps = service.getEmpList();

        //2.返回数据
        return Result.success(emps);
    }
}

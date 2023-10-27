package com.gzzz.service.impl;

import com.gzzz.dao.EmpDao;
import com.gzzz.pojo.Emp;
import com.gzzz.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * className: EmpServiceB
 * Package : com.gzzz.dao.impl
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/28 0:27
 * @Version 1.0
 */

@Service
//@Primary //表示出现多个同类型Bean时，此类生效
//@Component //表示将当前类交给IOC容器管理，成为IOC容器中的Bean ——控制反转 //切换服务时只需要注释掉这个注解，就是让其他EmpService交给容器管理
public class EmpServiceB implements EmpService {
    @Autowired //运行时，IOC容器会提供该类型的Bean对象，并赋值给该变量–依赖注入
    EmpDao empDao ;

    public List<Emp> getEmpList(){
        //1.接收DAO层数据
        List<Emp> emps = empDao.getEmpList();

        //2.对数据进行转换处理
        for (
                Emp emp :
                emps) {
            //处理gender属性
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男人");
            } else {
                emp.setGender("女人");
            }

            //处理job属性
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            }else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }

        }

        //3.返回数据
        return emps;
    }
}

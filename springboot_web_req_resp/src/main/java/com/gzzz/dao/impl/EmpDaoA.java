package com.gzzz.dao.impl;

import com.gzzz.dao.EmpDao;
import com.gzzz.pojo.Emp;
import com.gzzz.utils.XmlParserUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * className: EmpDaoA
 * Package : com.gzzz.dao.impl
 * Description:
 *
 * @Author gzzz
 * @Create 2023/10/27 23:45
 * @Version 1.0
 */
@Repository(value = "Dao1") //DAO实现类更具体的Component注解
//@Component //表示将当前类交给IOC容器管理，成为IOC容器中的Bean ——控制反转
public class EmpDaoA implements EmpDao {
    public List<Emp> getEmpList() {
        //1.加载并解析XML文件
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        List<Emp> emps = XmlParserUtils.parse(file, Emp.class);

        //2.返回数据
        return emps;
    }
}


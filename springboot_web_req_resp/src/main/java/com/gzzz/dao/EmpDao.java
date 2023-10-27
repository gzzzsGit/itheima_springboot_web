package com.gzzz.dao;

import com.gzzz.pojo.Emp;

import java.util.List;

/**
 * className: EmpDao
 * Package : com.gzzz.dao
 * Description:
 * TODO:
 *   DAO层获取的数据有可能是数据库中的，也有可能是调用外部API接口获取的，为了灵活的实现DAO层数据的增删改查
 *   需要先定义一个接口，实现灵活的DAO
 * @Author gzzz
 * @Create 2023/10/27 23:42
 * @Version 1.0
 */
public interface EmpDao {
    public List<Emp> getEmpList();

}

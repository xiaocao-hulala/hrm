package com.commons;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 18:25 2020/5/19
 *//*
*通用的dao方法
create by caocong on  2020/5/19
*/
public interface BaseDao<T> {

    //通过id查询单条数据
    //使用serializble也可以，因为所有基本数据类都实现了改接口
    //为了能够代表所有类型的
    T queryById(Object id);

    //查询指定数据
    //limit查询条数
    //offset查询起始位置
    List<T> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    //通过实体类作为条件查询
    List<T> queryAll(T t);


    //新增数据，t为新增的对象
    int insert(T t);

    //修改数据
    int update(T t);

    //根据主键删除数据
    int deleteById(Serializable id);

}

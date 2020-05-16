package com.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 17:12 2020/5/13
 *//*
*部门实体类
create by caocong on  2020/5/13
*/

@Data
public class Department {
    private  String dename;
    private  Integer id;
    private  String detail;

    //一个部门有多个员工
    private List<Worker> workers;

}

package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 11:42 2020/5/15
 *//*
*员工实体类
create by caocong on  2020/5/15
*/
@Data
public class Worker {
    private String name;
    private Integer id;
    private int tel;
    private String email;
    private String position;
    private String xueli;
    private String idcard;
    private int departmentid;
    private String address;
    private Date createtime;
}

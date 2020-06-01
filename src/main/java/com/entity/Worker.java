package com.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    private Long tel;
    private String email;
    private String position;
    private String xueli;
    private String idcard;
    private Integer departmentid;
    private String address;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createtime;

    //多对一关联查询，查询员工的时候，同时把员工部门也查出来
    private Department department;
}

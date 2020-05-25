package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:53 2020/5/12
 */
@Data
public class User {
    private  String loginname;
    private  Integer id;
    private  String username;
    private  Integer state;
    private Date createtime;
    private  String password;
}

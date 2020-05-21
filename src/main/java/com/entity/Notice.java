package com.entity;

import lombok.Data;

import java.util.Date;
/**
 * @Author:caocong
 * @Description:
 * @Date:create in 16:49 2020/5/15
 *//*
*公告实体类
create by caocong on  2020/5/15
*/
@Data
public class Notice {
    private Integer id;
    private Integer userid;
    private String content;
    private Date createtime;
    private User user;
}

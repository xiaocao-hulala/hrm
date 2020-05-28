package com.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 9:47 2020/5/20
 *//*
*文件实体类
create by caocong on  2020/5/20
*/
@Data
public class Document {
    private  String filename;
    private  String filepath;
    private  Integer id;
    private Date createtime;
    private  Integer userid;
    private  String desc;
}

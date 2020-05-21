package com.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (Position)实体类
 *
 * @author makejava
 * @since 2020-05-15 16:53:56
 */

@Data
@Table(name = "position")//可以设置区数据库中查询的表名
public class Position implements Serializable {

    private static final long serialVersionUID = 671314384813094235L;

    @Id  //该注解用于标识为主键，这样通过主键id查询就不会报错
   @KeySql(useGeneratedKeys = true)//该注解新增数据使得主键id自动生成
    private Integer id;

    @Column(name ="posiname")//设置映射名字，防止驼峰等造成映射到数据库中查询不到
    private String posiname;
    
    private String posidetail;
}
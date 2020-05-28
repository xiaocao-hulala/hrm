package com.entity;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date createtime;
    private  String password;
}

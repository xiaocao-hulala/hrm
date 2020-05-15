package com.service;

import com.entity.User;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 18:35 2020/5/13
 *//*
*用户业务接口
create by caocong on  2020/5/13
*/
public interface UserServiceDao {

    List<User>selectall();

}

package com.dao;

import com.entity.User;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 18:29 2020/5/13
 *//*
*用户逻辑类
create by caocong on  2020/5/13
*/
public interface UserDao {

    List<User> selectall();

    List<User> selectByParams(User user);

    int update(User user);

    int delete(int id);

    int insert(User user);
}

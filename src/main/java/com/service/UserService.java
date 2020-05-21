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
public interface UserService {

    List<User> selectall(int pageNum,int pageSize);

    List<User> selectByParams(User user);

    int update(User user);

    int delete(int id);

    int insert(User user);

    List<User>selectById(Integer id);

}

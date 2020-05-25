package com.dao;

import com.entity.User;

import java.util.List;
import java.util.Set;

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

    List<User>selectById(Integer id);

    //shiro中根据用户名查询用户信息
    User queryByUserName(String name);

    //根据用户名查询用户角色名称集合
    Set<String> queryRoleNameByUserName(String username);

    //根据用户名查询权限名称集合
    Set<String> querypressNameByUserName(String username);
}

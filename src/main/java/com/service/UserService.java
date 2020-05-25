package com.service;

import com.entity.User;

import java.util.List;
import java.util.Set;

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

    //shiro中根据用户名查询用户信息
    User queryByUserName(String name);

    //根据用户名查询用户角色名称集合
    Set<String> queryRoleNameByUserName(String username);

    //根据用户名查询权限名称集合
    Set<String> querypressNameByUserName(String username);

}

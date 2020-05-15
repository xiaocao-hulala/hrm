package com.service.serviceimpl;

import com.entity.User;
import com.service.UserServiceDao;
import com.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 18:36 2020/5/13
 *//*
*业务接口实现类
create by caocong on  2020/5/13
*/

public class UserServiceImpl {
    public List<User> selectall() {
        return null;
    }

    public List<User> selectuser() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        List<User> list = sqlSession.selectList("com.dao.UserDao.selectall");
        sqlSession.close();
        return list;
    }


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.selectuser().forEach(
                user -> {
                    System.out.println(user);
                }
        );
    }

}

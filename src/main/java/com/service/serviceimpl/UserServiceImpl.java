package com.service.serviceimpl;

import com.dao.UserDao;
import com.entity.User;
import com.github.pagehelper.PageHelper;
import com.service.UserService;
import com.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 18:36 2020/5/13
 *//*
*业务接口实现类
create by caocong on  2020/5/13
*/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> selectall(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userDao.selectall();
    }

    @Override
    public List<User> selectByParams(User user) {
        return userDao.selectByParams(user);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }
}

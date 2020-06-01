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
import java.util.Set;

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
    public List<User> selectall(User user) {
        return userDao.selectall(user);
    }

    @Override
    public List<User> selectByParams(User user, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
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

    @Override
    public List<User> selectById(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public User queryByUserName(String name) {
        return userDao.queryByUserName(name);
    }

    @Override
    public Set<String> queryRoleNameByUserName(String username) {
        return userDao.queryRoleNameByUserName(username);
    }

    @Override
    public Set<String> querypressNameByUserName(String username) {
        return userDao.querypressNameByUserName(username);
    }

}

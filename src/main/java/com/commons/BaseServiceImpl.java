package com.commons;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 20:56 2020/5/19
 *//*
*通用的服务层实现类
create by caocong on  2020/5/19
*/
public class BaseServiceImpl<T> implements BaseService<T> {

    protected  BaseDao baseDao;

    @Override
    public T queryById(Object id) {
        return (T) baseDao.queryById(id);
    }

    @Override
    public List<T> queryAllByLimit(int offset, int limit) {
        return baseDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<T> queryAll(T t) {
        return baseDao.queryAll(t);
    }

    @Override
    public boolean insert(T t) {
        if (baseDao.insert(t) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(T t) {
        if (baseDao.update(t) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteById(Serializable id) {

        if (baseDao.deleteById(id) > 0) {
            return true;
        }
        return false;
    }
}

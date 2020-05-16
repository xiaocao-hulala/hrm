package com.service.serviceimpl;

import com.entity.Worker;
import com.service.WorkServiceDao;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:40 2020/5/16
 *//*
*业务实现类
create by caocong on  2020/5/16
*/
public class WorkerServiceDaoImpl implements WorkServiceDao {
    @Override
    public List<Worker> selectAll() {
        return null;
    }

    @Override
    public List<Worker> selectByParams(Worker worker) {
        return null;
    }

    @Override
    public int addWorker(Worker worker) {
        return 0;
    }

    @Override
    public int deleteWorker(int workid) {
        return 0;
    }

    @Override
    public int updateWorker(Worker worker) {
        return 0;
    }
}

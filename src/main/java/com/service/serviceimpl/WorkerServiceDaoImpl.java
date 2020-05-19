package com.service.serviceimpl;

import com.dao.WorkerDao;
import com.entity.Worker;
import com.github.pagehelper.PageHelper;
import com.service.WorkServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:40 2020/5/16
 *//*
*业务实现类
create by caocong on  2020/5/16
*/

@Service
public class WorkerServiceDaoImpl implements WorkServiceDao {

    @Resource
    WorkerDao workerDao;


    @Override
    public List<Worker> selectAll(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return workerDao.selectAll();
    }


    @Override
    public List<Worker> selectByParams(Worker worker) {
        return workerDao.selectByParams(worker);
    }

    @Override
    public int addWorker(Worker worker) {
        return workerDao.addWorker(worker);
    }

    @Override
    public int deleteWorker(int workid) {
        return workerDao.deleteWorker(workid);
    }

    @Override
    public int updateWorker(Worker worker) {
        return workerDao.updateWorker(worker);
    }
}

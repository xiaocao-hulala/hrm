package com.dao;

import com.entity.Worker;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:35 2020/5/16
 *//*
*员工逻辑类
create by caocong on  2020/5/16
*/
public interface WorkerDao {

    List<Worker> selectAll();

    List<Worker> selectByParams(Worker worker);

    int addWorker(Worker worker);

    int deleteWorker(int workid);

    int updateWorker(Worker worker);

}

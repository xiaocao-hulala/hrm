package com.service;

import com.entity.Worker;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 19:39 2020/5/16
 *//*
*员工业务类
create by caocong on  2020/5/16
*/
public interface WorkServiceDao {

    List<Worker> selectAll(Worker worker);

    List<Worker> selectByParams(Worker worker,Integer pageNum,Integer pageSize);

    int addWorker(Worker worker);

    int deleteWorker(int workid);

    int updateWorker(Worker worker);

}

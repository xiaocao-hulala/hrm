package com.controller;

import com.entity.Worker;
import com.github.pagehelper.PageInfo;
import com.service.WorkServiceDao;
import com.util.jsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:50 2020/5/18
 *//*
*员工控制层
create by caocong on  2020/5/18
*/

@Controller
@RequestMapping("worker")
public class WorkerController {

    @Autowired
    WorkServiceDao workServiceDao;



    @RequestMapping("selectByParams")
    public void selectByParams(HttpServletRequest request,
                               HttpServletResponse response,
                               @RequestParam(value = "page", required = false) Integer page,
                               @RequestParam(value = "limit", required = false) Integer limit,
                               @RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "position", required = false) String position
    ) {
        Worker worker = new Worker();
        worker.setName(name);
        worker.setPosition(position);
        List<Worker> list = workServiceDao.selectByParams(worker, page, limit);
        int count = workServiceDao.selectAll(worker).size();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "查询成功");
        map.put("data", list);
        map.put("count", count);
        try {
            jsonUtil.responseWriteJson(response, map);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("updateworker")
    public String updateWorker(Worker worker, HttpServletRequest request) {
        workServiceDao.updateWorker(worker);
        return request.getContextPath() + "/WEB-INF/jsp/worker/show";
    }



    @RequestMapping("deleteWorker/{id}")
    public String deleteWorker(HttpServletRequest request,
                               @PathVariable(value = "id") Integer id
    ) {
        workServiceDao.deleteWorker(id);
        return request.getContextPath() + "/WEB-INF/jsp/worker/show";
    }



    @RequestMapping("addworker")
    public  String addWorker(HttpServletRequest request,Worker worker){
        workServiceDao.addWorker(worker);
        return request.getContextPath() + "/WEB-INF/jsp/worker/show";

    }
}

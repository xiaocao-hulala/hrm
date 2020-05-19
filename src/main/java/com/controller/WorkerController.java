package com.controller;

import com.entity.Worker;
import com.github.pagehelper.PageInfo;
import com.service.WorkServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("selectworkerall")
    public String selectWorker(Model model, @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                               @RequestParam(required = false, defaultValue = "2") Integer pageSize) {
        PageInfo<Worker> pageInfo = new PageInfo<>(workServiceDao.selectAll(pageNum, pageSize));

        //pageinfo所有分页信息都在里面，页面显示遍历出来时 pageinfo.list 集合  当前显示条数时pageinfo.starRow 当前显示几条 pageinfo.endRow
        //一共多少条:pageinfo.total,当前几条
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }


    @RequestMapping(value = "/deleteworker/{id}")
    public String deleteWorker(@PathVariable(value = "id") int id) {
        workServiceDao.deleteWorker(id);
        return "删除成功";
    }

    @RequestMapping("addWorker")
    public String addWorker(@ModelAttribute Worker worker) {
        workServiceDao.addWorker(worker);
        return "添加成功";
    }


    @RequestMapping("selectByParams")
    public String selectByParams(Worker worker) {
        workServiceDao.selectByParams(worker);
        return "查询成功";
    }


    @RequestMapping("updateWorker")
    public String updateWorker(Worker worker) {
        workServiceDao.updateWorker(worker);
        return "修改成功";
    }

}

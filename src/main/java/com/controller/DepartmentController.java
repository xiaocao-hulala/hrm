package com.controller;

import com.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 15:57 2020/5/19
 *//*
*部门控制层
create by caocong on  2020/5/19
*/
@Controller
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentDao departmentDao;

    public String select(Model model, @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                         @RequestParam(required = false, defaultValue = "2") Integer pageSize) {
        model.addAttribute("departmentlist", departmentDao.selectall());
        return "index";
    }




}

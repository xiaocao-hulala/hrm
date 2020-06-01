package com.controller;

import com.dao.DepartmentDao;
import com.entity.Department;
import com.service.DepartmentService;
import com.util.jsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    DepartmentService departmentService;

    @RequestMapping("selectByParams")
    public void select(@RequestParam(value = "departmentname", required = false) String departmentname
            , HttpServletResponse response
            , @RequestParam(value = "page", required = false) Integer page
            , @RequestParam(value = "limit", required = false) Integer limit
    ) {

        Department department = new Department();
        department.setDepartmentname(departmentname);
        int count = departmentService.selectall(department).size();
        List<Department> list = departmentService.selectByParams(department, page, limit);
        Map<String, Object> map = new HashMap<String, Object>();
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

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id, HttpServletRequest request) {
        departmentService.deleteDepartment(id);
        return request.getContextPath() + "/WEB-INF/jsp/department/show";
    }


    @RequestMapping("update")
    public String update(HttpServletRequest request, Department department) {
        departmentService.updateDepartment(department);
        return request.getContextPath() + "/WEB-INF/jsp/department/show";
    }

    @RequestMapping("insert")
    public String insert(HttpServletRequest request, Department department) {
        departmentService.addDepartment(department);
        return request.getContextPath() + "/WEB-INF/jsp/department/show";
    }

}

package com.service;

import com.entity.Department;
import com.entity.Departmentype;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:11 2020/5/13
 *//*
*部门业务接口类
create by caocong on  2020/5/13
*/
public interface DepartmentService {

    List<Department> selectall(Department department);

    List<Department>selectByParams(Department department,Integer pageNum,Integer pageSize);

    int addDepartment(Department department);

    int deleteDepartment(int id);

    int updateDepartment(Department department);

    int addDepartmentype(Departmentype departmentype);
}

package com.dao;

import com.entity.Department;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:09 2020/5/13
 *//*
*部门逻辑类
create by caocong on  2020/5/13
*/
public interface DepartmentDao {

    List<Department> selectall();

    List<Department> selectByParams(Department department);

    int addDepartment(Department department);

    int deleteDepartment(int id);

    int updateDepartment(Department department);

}


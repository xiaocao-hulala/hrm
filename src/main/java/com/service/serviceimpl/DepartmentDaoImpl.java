package com.service.serviceimpl;

import com.entity.Department;
import com.service.DepartmentServiceDao;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:12 2020/5/13
 *//*
*部门业务实现类
create by caocong on  2020/5/13
*/
public class DepartmentDaoImpl implements DepartmentServiceDao {
    public List<Department> selectall() {
        return null;
    }

    public List<Department> selectByParams(Department department) {
        return null;
    }

    public int addDepartment(Department department) {
        return 0;
    }

    public int deleteDepartment(int id) {
        return 0;
    }

    @Override
    public int updateDepartment(Department department) {
        return 0;
    }
}

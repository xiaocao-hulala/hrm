package com.service.serviceimpl;

import com.dao.DepartmentDao;
import com.entity.Department;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:caocong
 * @Description:
 * @Date:create in 23:12 2020/5/13
 *//*
*部门业务实现类
create by caocong on  2020/5/13
*/

@Service
public class DepartmentImpl implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;

    @Override
    public List<Department> selectall(Integer pageNum, Integer pageSize) {
        return departmentDao.selectall();
    }

    @Override
    public List<Department> selectByParams(Department department) {
        return departmentDao.selectByParams(department);
    }

    @Override
    public int addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    @Override
    public int deleteDepartment(int id) {
        return departmentDao.deleteDepartment(id);
    }

    @Override
    public int updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }
}

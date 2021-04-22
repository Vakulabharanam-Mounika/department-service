package com.example.demo.service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentServiceImpl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Override

    public Department createDepartment(Department department) {
        return departmentDao.save(department);
    }

    @Override

    public List<Department> displayAllDepartment() {
        return departmentDao.findAll();
    }

    @Override
    public Department findByDepartmentId(Integer departmentId) {
        return departmentDao.findByDepartmentId(departmentId);
    }

    @Override
    public Department findByDepartmentName(String departmentName) {
        return departmentDao.findByDepartmentName(departmentName);
    }

    @Override
    public Department findByEmployeeName(String employeeName) {
        return departmentDao.findByEmployeeName(employeeName);
    }

    @Override
    @Transactional
    public Integer deleteByDepartmentId(Integer departmentId) {
        return departmentDao.deleteByDepartmentId(departmentId);
    }

    @Override
    @Transactional
    public Department updateDepartment(Integer departmentId, Department department) {
        Department d=departmentDao.findByDepartmentId(departmentId);
        d.setDepartmentName(d.getDepartmentName());
        d.setEmployeeName(d.getEmployeeName());
        departmentDao.save(d);
        return d;
    }
}

package com.example.demo.service;

import com.example.demo.model.Department;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DepartmentService {

    public Department createDepartment(Department department);
    public List<Department> displayAllDepartment();
    public Department findByDepartmentId(Integer departmentId);
    public Department findByDepartmentName(String departmentName);
    public Department findByEmployeeName(String employeeName);
    public Integer deleteByDepartmentId(Integer departmentId);
    public Department updateDepartment(Integer departmentId,Department department);

}

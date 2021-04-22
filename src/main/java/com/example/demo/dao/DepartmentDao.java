package com.example.demo.dao;

import com.example.demo.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDao extends MongoRepository<Department,String> {
    @Query
    public Department findByDepartmentId(Integer departmentId);
    @Query
    public Department findByDepartmentName(String departmentName);
    @Query
    public Department findByEmployeeName(String employeeName);
    @Query
    public Integer deleteByDepartmentId(Integer departmentId);
}

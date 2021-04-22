package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department)
    {
        return new ResponseEntity<Department>(departmentService.createDepartment(department),HttpStatus.CREATED);
    }
    @GetMapping("/departments")
    public ResponseEntity<List<Department>> displayAll()
    {
        return new ResponseEntity<List<Department>>(departmentService.displayAllDepartment(),HttpStatus.OK);
    }



    /*@GetMapping(path = "/departments/{departmentId}")
    public ResponseEntity<Department> findByDepId(@PathVariable("departmentId") Integer departmentId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.findByDepartmentId(departmentId));
    }

    @GetMapping(path = "/departments/name/{departmentName}")
    public ResponseEntity<Department> findByDepartmentName(@PathVariable("departmentName") String departmentName)
    {
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.findByDepartmentName(departmentName));
    }

    @DeleteMapping(path = "/departments/{departmentId}")
    public ResponseEntity<Integer> deleteByDepartmentId(@RequestBody Integer departmentId)
    {
        return ResponseEntity.status(HttpStatus.OK).body(departmentService.deleteByDepartmentId(departmentId));
    }
    @PutMapping("/departments/{departmentId}")
    public ResponseEntity<Department> updateDepartment(@PathVariable("departmentId") Integer departmentId,
                                                   @RequestBody Department department)
    {
        Department bm1=departmentService.updateDepartment(departmentId,department);
        return ResponseEntity.status(HttpStatus.OK).body(bm1);
    }*/

}

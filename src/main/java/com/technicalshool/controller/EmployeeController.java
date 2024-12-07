package com.technicalshool.controller;

import com.technicalshool.DTO.Employee;
import com.technicalshool.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees(){
    return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        Employee employee = employeeService.getEmployeeList(id);
        return  ResponseEntity.status(200).body(employee);

    }
    @PostMapping
    public void saveEmployee(@RequestBody Employee employee){
       // Employee employee = new Employee(3L,"Vineet","head",7444);
        employeeService.saveEmployee(employee);
    }
}

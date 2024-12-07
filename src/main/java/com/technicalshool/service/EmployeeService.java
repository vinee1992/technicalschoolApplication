package com.technicalshool.service;

import com.technicalshool.DTO.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employeeList = Arrays.asList(
            new Employee(1L, "John Doe", "Developer",60000),
            new Employee(2L, "Jane Smith", "Manager",80000)
    );

    public List<Employee> getAllEmployees(){
        return  employeeList;
    }

    public Employee getEmployeeList(Long id){
        return employeeList.stream().filter(emp->emp.getId().equals(id)).findFirst().orElse(null);

    }

    public void saveEmployee(Employee employee) {
        System.out.println(employee.toString());
        List<Employee> l= new ArrayList<>();
        l.add(employee);
        System.out.println(l);
    }
}

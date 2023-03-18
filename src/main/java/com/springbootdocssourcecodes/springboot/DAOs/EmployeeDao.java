package com.springbootdocssourcecodes.springboot.DAOs;

import com.springbootdocssourcecodes.springboot.Entities.Employee;

import java.util.List;

public interface EmployeeDao {
    public Employee saveEmployee(Employee employee);
    public Employee readEmployee(Long id);
    public List<Employee> readAllEmployees();
    public void deleteEmployee(Long id);
}

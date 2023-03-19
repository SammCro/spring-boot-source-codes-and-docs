package com.springbootdocssourcecodes.springboot.Services;

import com.springbootdocssourcecodes.springboot.Entities.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee employee);
    public Employee findEmployee(Long id);
    public List<Employee> findAllEmployees();
    public void deleteEmployee(Long id);

}

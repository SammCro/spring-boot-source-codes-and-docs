package com.springbootdocssourcecodes.springboot.Services;

import com.springbootdocssourcecodes.springboot.DAOs.EmployeeDao;
import com.springbootdocssourcecodes.springboot.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


//we can use @Transactional annotation on the class level as well
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDao employeeDao;
    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    @Override
    public Employee findEmployee(Long id) {
        return employeeDao.readEmployee(id);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeDao.readAllEmployees();
    }

    @Override
    @Transactional
    public void deleteEmployee(Long id) {
        employeeDao.deleteEmployee(id);
    }
}

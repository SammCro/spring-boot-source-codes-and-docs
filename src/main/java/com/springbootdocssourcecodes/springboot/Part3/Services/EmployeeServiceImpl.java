package com.springbootdocssourcecodes.springboot.Part3.Services;

import com.springbootdocssourcecodes.springboot.Part3.Entities.Employee;
import com.springbootdocssourcecodes.springboot.Part3.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


//we can use @Transactional annotation on the class level as well
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findEmployee(Long id) {
        Optional<Employee> result = employeeRepository.findById(id);
        Employee theEmployee = null;

        if (result.isPresent()){
            theEmployee = result.get();
        }
        else{
            throw  new RuntimeException("Employee is not found.");
        }
        return theEmployee;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

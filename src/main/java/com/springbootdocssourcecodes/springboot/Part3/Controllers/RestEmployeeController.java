package com.springbootdocssourcecodes.springboot.Part3.Controllers;

import com.springbootdocssourcecodes.springboot.Part3.Entities.Employee;
import com.springbootdocssourcecodes.springboot.Part3.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestEmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public RestEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.findAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee  getEmployeeById(@PathVariable Long employeeId){
        if(employeeId == null)
            throw new RuntimeException("Employee id is null"
            );
        return employeeService.findEmployee(employeeId);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.saveEmployee(employee);
    }
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable Long employeeId){
        Employee employeeDeleted = employeeService.findEmployee(employeeId);
        if(employeeDeleted == null)
            throw new RuntimeException("Employee id is null"
            );
        employeeService.deleteEmployee(employeeId);
        return "deteted employee id: " + employeeId + " " + employeeDeleted.getFirstName() + " " + employeeDeleted.getLastName();
    }
}

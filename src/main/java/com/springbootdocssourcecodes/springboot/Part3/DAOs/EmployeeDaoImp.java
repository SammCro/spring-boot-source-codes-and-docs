package com.springbootdocssourcecodes.springboot.Part3.DAOs;

import com.springbootdocssourcecodes.springboot.Part3.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class EmployeeDaoImp implements EmployeeDao{

    private EntityManager entityManager;
    @Autowired
    public EmployeeDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public Employee readEmployee(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> readAllEmployees() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    public void deleteEmployee(Long id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}

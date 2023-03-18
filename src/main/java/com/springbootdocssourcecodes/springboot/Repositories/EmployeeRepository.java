package com.springbootdocssourcecodes.springboot.Repositories;

import com.springbootdocssourcecodes.springboot.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

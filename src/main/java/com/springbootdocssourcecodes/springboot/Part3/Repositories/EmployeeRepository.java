package com.springbootdocssourcecodes.springboot.Part3.Repositories;

import com.springbootdocssourcecodes.springboot.Part3.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

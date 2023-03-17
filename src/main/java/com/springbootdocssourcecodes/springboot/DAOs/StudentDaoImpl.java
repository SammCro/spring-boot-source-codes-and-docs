package com.springbootdocssourcecodes.springboot.DAOs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import com.springbootdocssourcecodes.springboot.Models.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
    private EntityManager entityManager;
    @Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void saveStudent(Student student) {
        entityManager.persist(student);
    }
}

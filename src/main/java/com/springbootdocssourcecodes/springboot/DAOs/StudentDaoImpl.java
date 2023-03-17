package com.springbootdocssourcecodes.springboot.DAOs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.springbootdocssourcecodes.springboot.Models.Student;
import java.util.List;
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

    @Override
    public Student readStudent(Integer id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> readAllStudents() {
        TypedQuery<Student> query = entityManager.createQuery("from Student order by lastName", Student.class);
        return query.getResultList();
    }

    @Override
    public Student findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("from Student where lastName=:lastName", Student.class);
        query.setParameter("lastName", lastName);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }
    @Override
    @Transactional
    public void deleteStudent(Integer id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAllStudents() {
        int numOfRowsDelete = entityManager.createQuery("delete from Student").executeUpdate();
        return numOfRowsDelete;
    }
}

package com.springbootdocssourcecodes.springboot.DAOs;

import com.springbootdocssourcecodes.springboot.Models.Student;
import java.util.List;

public interface StudentDao {
    public void saveStudent(Student student);

    public Student readStudent(Integer id);

    public List<Student> readAllStudents();

    public Student findByLastName(String lastName);

    public Student updateStudent(Student student);

    public void deleteStudent(Integer id);

    public int deleteAllStudents();
}

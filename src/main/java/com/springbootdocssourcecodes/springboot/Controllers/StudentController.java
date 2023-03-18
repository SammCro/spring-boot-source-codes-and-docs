package com.springbootdocssourcecodes.springboot.Controllers;


import com.springbootdocssourcecodes.springboot.Entities.Student;
import com.springbootdocssourcecodes.springboot.Exceptions.StudentErrorResponse;
import com.springbootdocssourcecodes.springboot.Exceptions.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController{
    private List<Student> theStudents;
    @PostConstruct
    private void loadStudents(){
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Samet", "Ozturk"));
        theStudents.add(new Student("Samet", "Ozturke"));
        theStudents.add(new Student("Samet", "Ozturker"));
    }
    @GetMapping("/students")
    public List<Student> getStudent(){
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId){
        if(studentId >= theStudents.size() || studentId < 0){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }
        return theStudents.get(studentId);
    }

}

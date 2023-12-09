package com.alibou.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private StudentService studentService ;
    @Autowired // je peux éliminer autowired
    public StudentController(StudentService studentService) { // constructor injection khatir autowired fou9 constructor //
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> findAllStudents(){
          return studentService.findAllStudents();
    }
}

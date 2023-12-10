package com.alibou.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@PostMapping
 public Student save (@RequestBody Student student){ // the incoming request body contains JSON data ==> Spring automatically deserializes the JSON data into a Student object
 return studentService.save(student);
 }

    @GetMapping( "/{email}")
    public Student findByEmail(
            @PathVariable("email") String email // bind the value of the email path variable to the email parameter of the method
    ) {
        return studentService.findByemail(email);
    }

    @PutMapping("/student")
    public Student updateStudent(
            @RequestBody Student student
    ) {
        return studentService.update(student);
    }


    @DeleteMapping("/{email}")
    public void delete(
            @PathVariable("email")  String email ){
        studentService.delete(email);
    }

    @GetMapping
    public List<Student> findAllStudents(){
          return studentService.findAllStudents();
    }
}

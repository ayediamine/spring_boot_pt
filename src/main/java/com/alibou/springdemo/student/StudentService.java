package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Ayedi",
                        "Amine",
                        LocalDate.now(),
                        "amine.ayadi@enis.tn",
                        23

                ),
                new Student(
                        "Mohamed",
                        "Ayedi",
                        LocalDate.now(),
                        "mohamed.ayadi@enis.tn",
                        20

                )
        );
    }
}

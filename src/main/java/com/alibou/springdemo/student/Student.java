package com.alibou.springdemo.student;

import java.time.LocalDate;

public class Student {
    private String FirstName ;
    private String LastName ;
    private LocalDate date ;
    private String email ;
    private int age ;

    public Student(String firstName,
                   String lastName,
                   LocalDate date,
                   String email,
                   int age) {
        FirstName = firstName;
        LastName = lastName;
        this.date = date;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();    }

    @Override
    public Student findByemail(String email) {
        return dao.findByemail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
      dao.delete(email);
    }
}

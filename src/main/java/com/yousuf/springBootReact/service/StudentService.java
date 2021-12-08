package com.yousuf.springBootReact.service;

import com.yousuf.springBootReact.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(Integer id);
}

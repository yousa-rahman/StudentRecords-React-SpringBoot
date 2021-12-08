package com.yousuf.springBootReact.controller;

import com.yousuf.springBootReact.model.Student;
import com.yousuf.springBootReact.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student Successfully Added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudent")
    public Student getStudentById(@RequestParam(name = "empId", required = true) Integer id){
        return studentService.getStudent(id);
    }

}

package com.example.springdemo1.controller;

import com.example.springdemo1.model.Student;
import com.example.springdemo1.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ResponseBody
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}

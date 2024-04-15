package com.example.springdemo1.service;

import com.example.springdemo1.model.Student;
import org.springframework.stereotype.Service;

public interface StudentService {
    Student getStudentById(int studentId);
}

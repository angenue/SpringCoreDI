package com.example.springdemo1.service;

import com.example.springdemo1.model.Phone;

import java.util.List;

public interface PhoneService {
    List<Phone> getPhoneByStudentId(int studentId);
}

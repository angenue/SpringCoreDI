package com.example.springdemo1.service;

import com.example.springdemo1.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    private final PhoneService phoneService;
    private final AddressService addressService;


    public StudentServiceImpl(PhoneService phoneService, AddressService addressService) {
        this.phoneService = phoneService;
        this.addressService = addressService;
    }

    @Override
    public Student getStudentById(int studentId) {
        Student student = new Student();
        student.setId(studentId);
        student.setName("John Doe");
        student.setPh(phoneService.getPhoneByStudentId(studentId));
        student.setAdd(addressService.getAddressByStudentId(studentId));
        return student;
    }
}

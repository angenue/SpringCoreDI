package com.example.springdemo1.service;

import com.example.springdemo1.model.Phone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Override
    public List<Phone> getPhoneByStudentId(int studentId) {
        Phone phone = new Phone();
        phone.setNumber("123456789");

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone);

        return phoneList;
    }
}

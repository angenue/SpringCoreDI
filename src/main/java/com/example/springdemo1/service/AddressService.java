package com.example.springdemo1.service;

import com.example.springdemo1.model.Address;

public interface AddressService {
    Address getAddressByStudentId(int studentId);
}

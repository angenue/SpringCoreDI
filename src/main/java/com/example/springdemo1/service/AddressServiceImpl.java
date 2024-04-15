package com.example.springdemo1.service;

import com.example.springdemo1.model.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService{
    @Override
    public Address getAddressByStudentId(int studentId) {
        Address address = new Address();
        address.setCity("Philadelphia");
        address.setCountry("United States");
        address.setState("PA");
        address.setZipcode("12345");
        return address;
    }
}

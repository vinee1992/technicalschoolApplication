package com.technicalshool.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TechSchoolService {

    public String testController(){
        return "This is the first method to test controller";

    }
}

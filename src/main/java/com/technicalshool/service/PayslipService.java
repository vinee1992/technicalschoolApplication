package com.technicalshool.service;

import com.technicalshool.DTO.Employee;
import com.technicalshool.DTO.PaySlip;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PayslipService {

    private List<PaySlip> paySlipList = Arrays.asList(

            new PaySlip(1L, 50000,"7/12/2024",new Employee(1L, "John Doe", "Developer", 60000)),
            new PaySlip(2L, 4000,"6/12/2023" ,new Employee(2L, "Jane Smith", "Manager", 80000))
    );

    public List<PaySlip> getAllPayslips() { return paySlipList; }

    public PaySlip getPayslipById(Long id) { return paySlipList.stream().filter(payslip -> payslip.getId().equals(id)).findFirst().orElse(null); }
}



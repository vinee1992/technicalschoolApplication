package com.technicalshool.DTO;

public class PaySlip {

    private Long id;
    private Employee employee;
    private String date;
    private double amount;

    public Employee getEmployee() {
        return employee;
    }

    public PaySlip(Long id, double amount, String date, Employee employee) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}

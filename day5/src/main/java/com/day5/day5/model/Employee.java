package com.day5.day5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int empolyeeId;
    public String employeeName;
    public String employeeEmail;
    public double salary;
    public int department;
    public int getEmpolyeeId() {
        return empolyeeId;
    }
    public void setEmpolyeeId(int empolyeeId) {
        this.empolyeeId = empolyeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }
    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public Employee(int empolyeeId, String employeeName, String employeeEmail, double salary, int department) {
        this.empolyeeId = empolyeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.salary = salary;
        this.department = department;
    }
    public Employee(){}
}

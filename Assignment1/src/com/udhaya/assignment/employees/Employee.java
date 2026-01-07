package com.udhaya.assignment.employees;


public class Employee {

    private String name;
    private int employeeId;
    protected double salary;

 
    public void setName(String name) {
        this.name = name;
    }

 
    public String getName() {
        return name;
    }

 
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public int getEmployeeId() {
        return employeeId;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

  
    public double getSalary() {
        return salary;
    }
}

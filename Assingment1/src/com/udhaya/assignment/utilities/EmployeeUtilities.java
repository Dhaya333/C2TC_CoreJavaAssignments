package com.udhaya.assignment.utilities;

import com.udhaya.assignment.employees.Employee;


public class EmployeeUtilities {

  
    public static void printEmployee(Employee emp) {
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }

  
    public static void incrementSalary(Employee emp, double amount) {
        emp.setSalary(emp.getSalary() + amount);
    }
}

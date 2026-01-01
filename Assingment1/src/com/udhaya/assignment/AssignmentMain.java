package com.udhaya.assignment;

import com.udhaya.assignment.employees.Manager;
import com.udhaya.assignment.employees.Developer;
import com.udhaya.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Udhaya");
        manager.setEmployeeId(101);
        manager.setSalary(75000);
        manager.setDepartment("Operations");

        Developer developer = new Developer();
        developer.setName("Arjun");
        developer.setEmployeeId(102);
        developer.setSalary(60000);
        developer.setProgrammingLanguage("Java");

        EmployeeUtilities.printEmployee(manager);
        EmployeeUtilities.incrementSalary(manager, 5000);

        EmployeeUtilities.printEmployee(developer);
        EmployeeUtilities.incrementSalary(developer, 3000);
    }
}

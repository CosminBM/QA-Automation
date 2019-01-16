package com.cosmin;

import java.util.*;

public class Organization {

    private List<Employee> employees = new ArrayList<Employee>();


    public void addEmployees(Employee person) {

        this.employees.add(person);
    }

    public void removeEmployees(Employee person) {

        if(employees.contains(person)){
            employees.remove(person);
        } else{
            System.out.println("The list of the employees is " + employees.size());
        }

    }


    public void editEmployees(Employee updatedEmployee) {

    }

    public void searchEmployees(Employee searchEmployee, String name, int age, String sex, String department) {

    }


}

package com.cosmin;

import java.util.*;

public class Organization {

    private List<Employee> employees = new ArrayList<Employee>();


    public void add(Employee person) {

        this.employees.add(person);
    }

    public void remove(Employee person) {

        if(employees.contains(person)){
            employees.remove(person);
        } else{
            System.out.println("The list of the employees is " + employees.size());
        }

    }


    public void edit(Employee person) {

    }

    public void search(Employee person) {

        HashMap<Employee, Object> data = new HashMap<>();





    }


}

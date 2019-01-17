package com.cosmin;

import java.util.*;

public class Organization {

    private List<Employee> employees = new ArrayList<Employee>();


    public void add(Employee employee) {

        this.employees.add(employee);
    }

    public void remove(Employee employee) {

        if (employees.contains(employee)) {
            employees.remove(employee);
        } else {
            System.out.println("The list of the employees is " + employees.size());
        }

    }


    public Employee search(String name, int age, String sex, String department) {

        for (Employee employee : employees) {

            if (name != null && name.equalsIgnoreCase(employee.getName()) && sex != null && sex.equalsIgnoreCase(employee.getSex())
                    && age != 0 && age == (employee.getAge()) && department != null && department.equalsIgnoreCase(employee.getDepartment())) {
                return employee;
            }

        }

        return null;
    }

    public void edit(Employee employee) {


    }


}

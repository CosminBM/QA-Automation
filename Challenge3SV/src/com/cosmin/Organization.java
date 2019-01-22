package com.cosmin;

import java.util.*;
import java.util.stream.Collectors;

public class Organization {

    private List<Employee> employees = new ArrayList<Employee>();

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    public void remove(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
        }
    }

    public Employee searchName(String name) {
//        List<Employee> search = this.employees.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());
        for (Employee employee : employees) {
            if (name != null && name.equalsIgnoreCase(employee.getName())) {
                return employee;
            }
        }
        return null;
    }

    public Employee searchAge(int age) {
        for (Employee employee : employees) {
            if (age != 0 && age == (employee.getAge())) {
                return employee;
            }
        }
        return null;
    }

    public Employee searchGender(Employee.Gender gender) {
        for (Employee employee : employees) {
            if (gender != null && gender == (employee.getGender())) {
                return employee;
            }
        }
        return null;
    }

    public Employee searchDepartment(String department) {
        for (Employee employee : employees) {
            if (department != null && department.equalsIgnoreCase(employee.getDepartment())) {
                return employee;
            }
        }
        return null;
    }

    public void edit(Employee employee) {

    }
}

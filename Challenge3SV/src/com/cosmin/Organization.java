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

    public List<Employee> searchName(String name) {
        List<Employee> search = this.employees.stream().filter
                (employee -> employee.getName().equals(name)).collect(Collectors.toList());
        return search;
    }

    public List<Employee> searchAge(int age) {
        List<Employee> search = this.employees.stream().filter
                (employee -> employee.getAge() == (age)).collect(Collectors.toList());
        return search;
    }

    public List<Employee> searchGender(Gender gender) {
        List<Employee> search = this.employees.stream().filter
                (employee -> employee.getGender().equals(gender)).collect(Collectors.toList());
        return search;
    }

    public List<Employee> searchDepartment(Department department) {
        List<Employee> search = this.employees.stream().filter
                (employee -> employee.getDepartment().equals(department)).collect(Collectors.toList());
        return search;
    }

//    TBD
//    public List<Employee> updateByName(String employee, String name) {
//        List<Employee> names = searchName(employee);
//        names.forEach(emp -> emp.setName(name));
//        return names;
//    }


}
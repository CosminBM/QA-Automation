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

    public List searchName(String name) {
        List<Employee> search = this.employees.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList());
        search.forEach(s -> System.out.println(s.getName()));
        return null;
//        for (Employee employee : employees) {
//            if (name != null && name.equalsIgnoreCase(employee.getName())) {
//                return employee;
//            }
//        }
//        return null;
    }

    public List searchAge(int age) {
        List<Employee> search = this.employees.stream().filter(n -> n.getAge() == (age)).collect(Collectors.toList());
        search.forEach(s -> System.out.println(s.getAge() + ", " + s.getName()));
        return null;
//        for (Employee employee : employees) {
//            if (age != 0 && age == (employee.getAge())) {
//                return employee;
//            }
//        }
//        return null;
    }

    public List searchGender(Employee.Gender gender) {
        List<Employee> search = this.employees.stream().filter(n -> n.getGender().equals(gender)).collect(Collectors.toList());
        search.forEach(s -> System.out.println(s.getGender() + ", " + s.getName()));
        return null;
//        for (Employee employee : employees) {
//            if (gender != null && gender == (employee.getGender())) {
//                return employee;
//            }
//        }
//        return null;
    }

    public List searchDepartment(String department) {
        List<Employee> search = this.employees.stream().filter(n -> n.getDepartment().equals(department)).collect(Collectors.toList());
        search.forEach(s -> System.out.println(s.getDepartment() + ", " + s.getName()));
        return null;
//        for (Employee employee : employees) {
//            if (department != null && department.equalsIgnoreCase(employee.getDepartment())) {
//                return employee;
//            }
//        }
//        return null;
    }

    public void edit(Employee employee) {

    }
}

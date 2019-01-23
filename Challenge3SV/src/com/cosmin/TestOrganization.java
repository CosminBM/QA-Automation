package com.cosmin;

import java.util.*;

public class TestOrganization {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", 24, Employee.Gender.MALE, "QA");
        Employee employee2 = new Employee("Marius", 33, Employee.Gender.MALE, "IT");
        Employee employee3 = new Employee("Clara", 22, Employee.Gender.FEMALE, "HR");
        Employee employee4 = new Employee("Mihai", 40, Employee.Gender.MALE, "DEV");
        Employee employee5 = new Employee("Adrian", 33, Employee.Gender.MALE, "QA");
        Employee employee6 = new Employee("Andreea", 25, Employee.Gender.FEMALE, "HR");
        Employee employee7 = new Employee("Clara", 25, Employee.Gender.FEMALE,"DEV");

//        employee1.setName("Adrian");
//        employee2.setAge(43);
//        employee3.setDepartment("DEV");
//        employee4.setGender(Employee.Gender.FEMALE);

        Organization testOrga = new Organization();
        testOrga.add(employee1);
        testOrga.add(employee2);
        testOrga.add(employee3);
        testOrga.add(employee4);
        testOrga.add(employee5);
        testOrga.add(employee6);
        testOrga.add(employee7);
        testOrga.searchAge(25).forEach(employee -> System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getGender() + ", " +  employee.getDepartment()));
        testOrga.searchName("Clara").forEach(employee -> System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getGender() + ", " +  employee.getDepartment()));
        testOrga.searchDepartment("DEV").forEach(employee -> System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getGender() + ", " +  employee.getDepartment()));
        testOrga.searchGender(Employee.Gender.MALE).forEach(employee -> System.out.println(employee.getName() + ", " + employee.getAge() + ", " + employee.getGender() + ", " +  employee.getDepartment()));
    }
}

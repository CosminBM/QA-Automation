package com.cosmin;

import java.util.*;

public class TestOrganization {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", 24, Employee.Gender.MALE, "QA");
        Employee employee2 = new Employee("Marius", 33, Employee.Gender.MALE, "IT");
        Employee employee3 = new Employee("Clara", 22, Employee.Gender.FEMALE, "IT");
        Employee employee4 = new Employee("Cristi", 40, Employee.Gender.MALE, "DEV");
        employee1.setName("Adrian");
        employee2.setAge(43);
        employee3.setDepartment("DEV");
        employee4.setGender(Employee.Gender.MALE);

        Organization testOrga = new Organization();
        testOrga.add(employee1);
        testOrga.add(employee2);
        testOrga.add(employee3);
        testOrga.add(employee4);
        System.out.println((testOrga.searchAge(22).getName()));
        System.out.println(testOrga.searchDepartment("IT").getName());
        System.out.println(testOrga.searchName("Clara").getGender());
        System.out.println(testOrga.searchGender(Employee.Gender.MALE).getName());
    }
}

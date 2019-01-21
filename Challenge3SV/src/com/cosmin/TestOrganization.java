package com.cosmin;

import java.util.*;

public class TestOrganization {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", 24, "Male", "QA");
        Employee employee2 = new Employee("Marius", 33, "Male", "IT");
        Employee employee3 = new Employee("Clara", 22, "Female", "HR");
        Employee employee4 = new Employee("Cristi", 40, "Male", "DEV");
        employee1.setName("Adrian");
        employee2.setAge(43);
        employee3.setDepartment("DEV");
        employee4.setGender("Unknown");



        Organization testOrga = new Organization();
        testOrga.add(employee1);
        testOrga.add(employee2);
        testOrga.add(employee3);
        System.out.println((testOrga.searchAge(22)));
        System.out.println(testOrga.searchDepartment("IT"));
        System.out.println(testOrga.searchName("Clara"));
        System.out.println(testOrga.searchGender("Male"));


    }


}

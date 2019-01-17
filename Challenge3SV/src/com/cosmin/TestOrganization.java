package com.cosmin;


public class TestOrganization {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", 24, "Male", "QA");
        Employee employee2 = new Employee("Marius", 33, "Male", "IT");
        Employee employee3 = new Employee("Clara", 22, "Female", "HR");
        employee1.setName("John");
        employee2.setDepartment("DEV");
        employee3.setSex("Male");
        employee1.setAge(42);

        Organization testOrga = new Organization();
        testOrga.add(employee1);
        testOrga.add(employee2);
        testOrga.add(employee3);
        testOrga.search("", 22, "", "");
        testOrga.search("", 0 , "Female", "");
        testOrga.search("Marius", 0, "", "");

        System.out.println(employee1);

    }


}

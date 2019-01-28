package com.cosmin;

import java.util.*;

public class TestOrganization {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Andrei", 24, Gender.MALE, Department.QA);
        Employee employee2 = new Employee("Marius", 33, Gender.MALE, Department.IT);
        Employee employee3 = new Employee("Clara", 22, Gender.FEMALE, Department.HR);
        Employee employee4 = new Employee("Mihai", 40, Gender.MALE, Department.DEV);
        Employee employee5 = new Employee("Adrian", 33, Gender.MALE, Department.QA);
        Employee employee6 = new Employee("Andreea", 25, Gender.FEMALE, Department.HR);
        Employee employee7 = new Employee("Clara", 25, Gender.FEMALE, Department.DEV);

        employee1.setName("Adrian");
        employee2.setAge(43);
        employee3.setDepartment(Department.DEV);
        employee4.setGender(Gender.FEMALE);

        Organization testOrga = new Organization();
        testOrga.add(employee1);
        testOrga.add(employee2);
        testOrga.add(employee3);
        testOrga.add(employee4);
        testOrga.add(employee5);
        testOrga.add(employee6);
        testOrga.add(employee7);

        if (testOrga.searchName("Clara").size() == 0) {
            System.out.println("Name not found!");
        } else {
            testOrga.searchName("Clara").forEach(employee -> System.out.println(employee.getName() + ", "
                    + employee.getAge() + ", " + employee.getGender() + ", " + employee.getDepartment()));
        }

        if (testOrga.searchAge(22).size() == 0) {
            System.out.println("Age not found!");
        } else {
            testOrga.searchAge(22).forEach(employee -> System.out.println(employee.getName() + ", "
                    + employee.getAge() + ", " + employee.getGender() + ", " + employee.getDepartment()));
        }

        if (testOrga.searchDepartment(Department.DEV).size() == 0) {
            System.out.println("Department not found!");
        } else {
            testOrga.searchDepartment(Department.DEV).forEach(employee -> System.out.println(employee.getName() + ", "
                    + employee.getAge() + ", " + employee.getGender() + ", " + employee.getDepartment()));
        }

        if (testOrga.searchGender(Gender.MALE).size() == 0) {
            System.out.println("Gender not found!");
        } else {
            testOrga.searchGender(Gender.MALE).forEach(employee -> System.out.println(employee.getName() + ", "
                    + employee.getAge() + ", " + employee.getGender() + ", " + employee.getDepartment()));
        }

        testOrga.updateEmpByName(employee1, "Clara");
        List<Employee> updList = testOrga.updateEmpByName(employee1,"Clara");
        updList.forEach(employee -> System.out.println(employee.getAge()));


    }
}

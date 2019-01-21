package com.cosmin;

import java.util.*;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getDepartment() {
        return this.department;
    }

    public Employee(String name, int age, String gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }

}

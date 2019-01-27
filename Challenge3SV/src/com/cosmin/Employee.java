package com.cosmin;

import java.util.*;

public class Employee {
    private String name;
    private int age;
    private Gender gender;
    private Department department;

    public Employee(String name, int age, Gender gender, Department department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setGender(Gender newGender) {
        this.gender = newGender;
    }

    public void setDepartment(Department newDepartment) {
        this.department = newDepartment;
    }
}
package com.cosmin;

import java.util.*;

public class Employee {
    private String name;
    private int age;
    private Gender gender;
    private String department;

    public Employee(String name, int age, Gender gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    public enum Gender {FEMALE, MALE, UNKNOWN}

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getDepartment() {
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

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}
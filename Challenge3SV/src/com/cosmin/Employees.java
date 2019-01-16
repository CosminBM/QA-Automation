package com.cosmin;

import java.util.*;

public class Employees {

    private String name;
    private int age;
    private String sex;
    private String department;


    public Employees(String name, int age, String sex, String department) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;

    }

    public void addName(String newName) {

        name = newName;

    }

    public void addAge(int newAge) {

        age = newAge;

    }

    public void addSex(String newSex) {

        sex = newSex;

    }

    public void addDepartment(String newDepartment) {

        department = newDepartment;

    }


}

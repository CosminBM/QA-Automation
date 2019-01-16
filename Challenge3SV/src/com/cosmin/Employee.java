package com.cosmin;

import java.util.*;

public class Employee {

    private String name;
    private int age;
    private String sex;
    private String department;


    public Employee(String name, int age, String sex, String department) {

        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;

    }

    public void setName(String newName) {

        this.name = newName;

    }

    public void setAge(int newAge) {

        this.age = newAge;

    }

    public void setSex(String newSex) {

        this.sex = newSex;

    }

    public void setDepartment(String newDepartment) {

        this.department = newDepartment;

    }


}

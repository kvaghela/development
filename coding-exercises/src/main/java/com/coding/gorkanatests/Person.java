package com.coding.gorkanatests;

import java.util.Date;

public class Person {
    private int age;
    private Date dateOfBirth;

    public Person(int age, Date dateOfBirth) {
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
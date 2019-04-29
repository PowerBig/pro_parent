package com.butoube.jdk8.study;

/**
 * 员工信息实体类
 */
public class Employee {
    private String name;
    private int age;
    private double solary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSolary() {
        return solary;
    }

    public void setSolary(double solary) {
        this.solary = solary;
    }

    public Employee(String name, int age, double solary) {
        this.name = name;
        this.age = age;
        this.solary = solary;
    }

    public Employee() {
    }
}

package com.java8.streamcoding.dto;

import com.sun.tools.attach.AgentInitializationException;
import jdk.jfr.DataAmount;


public class Employee {
    private int id;
    private String name;
    private Integer sallary;
    private int age;
    private String department;

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sallary=" + sallary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int id, String name, Integer sallary, int age){
        this.id = id;
        this.name = name;
        this.sallary = sallary;
        this.age=age;
    }

    public Employee(int id, String name, Integer sallary, int age, String department){
        this.id = id;
        this.name = name;
        this.sallary = sallary;
        this.age=age;
        this.department=department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSallary() {
        return sallary;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }


}

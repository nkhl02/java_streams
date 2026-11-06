package com.java8.streamcoding;

import com.java8.streamcoding.dto.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeBySallary {

    private List<Employee> empList = new ArrayList<>();

    SortEmployeeBySallary(){
        Employee employee1 = new Employee(1,"Nikhil",2000,21);
        Employee employee2 = new Employee(2,"Aman",2500,35);
        Employee employee3 = new Employee(3,"Ramu",1100,27);
        this.empList.add(employee1);
        this.empList.add(employee2);
        this.empList.add(employee3);
    }

    public void sortBySallary(){
        List<Employee> result = this.empList.stream()
                .sorted(Comparator.comparing(Employee::getSallary).reversed())
                .toList();
        System.out.println(result);
    }
}

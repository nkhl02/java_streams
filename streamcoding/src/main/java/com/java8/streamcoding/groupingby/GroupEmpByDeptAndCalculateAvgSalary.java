package com.java8.streamcoding.groupingby;

import com.java8.streamcoding.dto.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupEmpByDeptAndCalculateAvgSalary {

    private List<Employee> empList = new ArrayList<>();
    private Map<String, Double> result = new HashMap<>();

    public GroupEmpByDeptAndCalculateAvgSalary() {
        Employee employee1 = new Employee(1, "Nikhil", 2000, 21, "Sales");
        Employee employee2 = new Employee(2, "Aman", 2500, 35, "Sales");
        Employee employee3 = new Employee(3, "Ramu", 1100, 27, "Marketing");
        Employee employee4 = new Employee(4, "Raju", 2350, 21, "Sales");
        Employee employee5 = new Employee(5, "Suresh", 1500, 35, "Marketing");
        Employee employee6 = new Employee(6, "Rinku", 5000, 27, "Support");
        this.empList.add(employee1);
        this.empList.add(employee2);
        this.empList.add(employee3);
        this.empList.add(employee4);
        this.empList.add(employee5);
        this.empList.add(employee6);
    }

    public void groupEmpByDeptAndCalAvgSalary(){
        result =  empList.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.averagingInt(Employee::getSallary)
        ));

        System.out.println(result);
    }
}
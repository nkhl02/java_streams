package com.java8.streamcoding.groupingby;

import com.java8.streamcoding.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighestPaidEmployeeInEachDept {

    private List<Employee> empList = new ArrayList<>();
    private Map<String, Optional<Employee>> result = new HashMap<>();

    public FindHighestPaidEmployeeInEachDept() {
        Employee employee1 = new Employee(1, "Nikhil", 2000, 21, "Sales");
        Employee employee2 = new Employee(2, "Aman", 200, 35, "Sales");
        Employee employee3 = new Employee(3, "Ramu", 1100, 27, "Marketing");
        Employee employee4 = new Employee(4, "Raju", 2000, 21, "Sales");
        Employee employee5 = new Employee(5, "Suresh", 1500, 35, "Marketing");
        Employee employee6 = new Employee(6, "Rinku", 5000, 27, "Support");
        Employee employee7 = new Employee(3, "samay", 4532, 27, "Marketing");
        Employee employee8 = new Employee(4, "rinku", 2356, 21, "Sales");

        this.empList.add(employee1);
        this.empList.add(employee2);
        this.empList.add(employee3);
        this.empList.add(employee4);
        this.empList.add(employee5);
        this.empList.add(employee6);
        this.empList.add(employee7);
        this.empList.add(employee8);
    }

    public void findHighestPaidEmpInEachDept(){
        result = empList.stream()
                .collect(Collectors.groupingBy(
                   Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getSallary))
                ));

        System.out.println(result);
    }

}

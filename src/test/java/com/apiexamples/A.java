package com.apiexamples;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args){
        List<Employee> data = Arrays.asList(
                new Empolyee (1,5000,"mike"),
                new Employee (1,5000,"rajalaxmi"),
                new Employee (1,5000,"puja"),
                new Employee (1,5000,"adam")
        );
        Map<Integer, List<Empolyee>> empGroups  = data.stream().collect(Collectors.groupingBy(e->e.getsal()));
        System.out.println(empGroups);

    }
}

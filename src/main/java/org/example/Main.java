package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(2,"satish", "lucknow"));
        emp.add(new Employee(4,"manish", "bihar"));
        emp.add(new Employee(3,"kunal", "banglore"));
        emp.add(new Employee(6,"bijay", "mp"));
        emp.add(new Employee(1,"uttam", "delhi"));

        // defalut order
        System.out.println(emp);

        // sorting based on id
        List<Employee> sortedEmpById = emp.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList());
        System.out.println(sortedEmpById);

        //sorting based on name
        List<Employee> sortedEmpByName = emp.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        System.out.println(sortedEmpByName);

        // sorting based on city
        List<Employee> sortedEmpByCity = emp.stream().sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity())).collect(Collectors.toList());
        System.out.println(sortedEmpByCity);

    }
}
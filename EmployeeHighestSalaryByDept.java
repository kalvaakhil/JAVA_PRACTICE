package Java8;

import Collections.EmployeeData;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeHighestSalaryByDept {
    public static void main(String[] args) {
        List<EmployeeDetails> employees = Arrays.asList(
                new EmployeeDetails(1, "Alice", 60000, "HR"),
                new EmployeeDetails(2, "Bob", 50000, "IT"),
                new EmployeeDetails(3, "Charlie", 75000, "IT"),
                new EmployeeDetails(4, "David", 45000, "Finance"),
                new EmployeeDetails(5, "Eva", 80000, "HR"),
                new EmployeeDetails(6, "Frank", 55000, "Finance"),
                new EmployeeDetails(7, "Grace", 70000, "IT")
        );
        Map<String, Optional<EmployeeDetails>> highestSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDetails::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeDetails::getSalary))
                        )
                );
        highestSalaryByDept.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
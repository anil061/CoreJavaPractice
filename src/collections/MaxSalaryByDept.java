package collections;

import java.util.*;
import java.util.stream.Collectors;

public class MaxSalaryByDept {
    public static void main(String[] args) {
        List<EmployeByDept> listOfEmployees = Arrays.asList(
                new EmployeByDept(101, "Alice", "HR", 50000),
                new EmployeByDept(102, "Bob", "IT", 70000),
                new EmployeByDept(103, "Charlie", "HR", 60000),
                new EmployeByDept(104, "David", "IT", 90000),
                new EmployeByDept(105, "Eve", "Finance", 75000),
                new EmployeByDept(106, "Frank", "Finance", 80000)
        );

        // Group by department and get the employee with the max salary
        Collection<EmployeByDept> highestPaidByDept = listOfEmployees.stream()
                .collect(Collectors.groupingBy(
                        dep -> dep.getDepartment(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(sal-> sal.getSalary())),
                                Optional::get
                        )
                        )).values();

               /* .collect(Collectors.groupingBy(
                        e -> e.getDepartment(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())),
                                Optional::get
                        )
                ))
                .values();*/

        // Print result
        highestPaidByDept.forEach(System.out::println);
    }
}

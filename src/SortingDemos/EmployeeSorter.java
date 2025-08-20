package SortingDemos;


import Java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSorter {
    public static void main(String[] args) {
        List<EmployeForSort> employees = Arrays.asList(
                new EmployeForSort(104, "Alice", "HR", 65000, "Female"),
                new EmployeForSort(102, "Bob", "Engineering", 75000, "Male"),
                new EmployeForSort(101, "Charlie", "Sales", 60000, "Male"),
                new EmployeForSort(105, "Eve", "Engineering", 85000, "Female"),
                new EmployeForSort(103, "David", "Marketing", 55000, "Male"),
                new EmployeForSort(104, "Alice", "Marketing", 65000, "Female"),
                new EmployeForSort(104, "Alice", "Engineering", 65000, "Female")
        );

        //Sort by id ascending order

        List<EmployeForSort> sortById = employees.stream()
                .sorted(Comparator.comparingInt(EmployeForSort::getId))
                .collect(Collectors.toList());
        System.out.println("SortBy Id ===>" + sortById);

        Map<String, Long> genderCount = employees.stream()
                .collect(Collectors.groupingBy(EmployeForSort::getGender, Collectors.counting()));
        genderCount.forEach((gender, count)-> {
            System.out.println("Gender :" + gender + " Count :" + count);
        });

        // Find a person involved in multiple deparments
        Map<String, Set<String>> employeInMultipleDept = employees
                .stream()
                .collect(Collectors.groupingBy(EmployeForSort::getName,
                        Collectors.mapping(EmployeForSort::getDepartment, Collectors.toSet())
                ));
        employeInMultipleDept.entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() != 0)
                .forEach(entry -> System.out.println(
                    entry.getKey() + " works in deparments " + entry.getValue())
                );

    }
}

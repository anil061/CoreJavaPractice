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

        List<EmployeForSort> sortedEmpId = employees.stream()
                .sorted(Comparator.comparing(EmployeForSort::getId))
                .collect(Collectors.toList());

        Map<String, Long> genderCount = sortedEmpId.stream()
                .collect(Collectors.groupingBy(EmployeForSort::getGender, Collectors.counting()));

        //More gendercount in which deparment
        Map.Entry<String, Long> maxGenderCntValue = Collections.max(genderCount.entrySet(), Map.Entry.comparingByValue());
        System.out.println("Gender with max count " + maxGenderCntValue.getKey() + " Count: " + maxGenderCntValue.getValue());

        //Print a person name whos salary is more greater than all persons
        EmployeForSort highestSalaryPerson = sortedEmpId.stream()
                .max(Comparator.comparing(EmployeForSort::getSalary))
                .orElse(null);
        System.out.println("Highest salary person name is " + highestSalaryPerson.getName() + " Salary is " + highestSalaryPerson.getSalary());

        //Print Department name whose male count is greater than female count
        Map<String, Map<String, Long>> deptCount = sortedEmpId.stream()
                .collect(Collectors.groupingBy(EmployeForSort::getDepartment,
                        Collectors.groupingBy(EmployeForSort::getGender, Collectors.counting())));
        deptCount.forEach((dept, gCount)->{
            long maleCount = gCount.getOrDefault("Male", 0L);
            long femaleCount = gCount.getOrDefault("FeMale", 0L);
            if(maleCount > femaleCount){
                System.out.println("Department: " + dept + " -> Male: " + maleCount + ", Female: " + femaleCount);
            }
        });

        //Print a person whose dept is "Marketing"
       sortedEmpId.stream()
                .filter(x -> x.getDepartment().equals("Marketing"))
                 .forEach(x-> System.out.println("Name: " + x.getName()
                                    + ", Dept  " + x.getDepartment()
                                    + ", Salary " + x.getSalary()));

        //Above alternative method
        sortedEmpId.stream()
                .collect(Collectors.groupingBy(EmployeForSort::getGender, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e-> System.out.println("Max Gender: " + e.getKey() + " Count: " + e.getValue()));


        //Sort by id ascending order

        List<EmployeForSort> sortById = employees.stream()
                .sorted(Comparator.comparingInt(EmployeForSort::getId))
                .collect(Collectors.toList());
        System.out.println("SortBy Id ===>" + sortById);
        // get Gender count
        Map<String, Long> genderCountTest = employees.stream()
                .collect(Collectors.groupingBy(EmployeForSort::getGender, Collectors.counting()));
        genderCountTest.forEach((gender, count)-> {
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
                .filter(entry -> entry.getValue().size()>1)
                .forEach(entry -> System.out.println(
                    entry.getKey() + " works in deparments " + entry.getValue())
                );

    }
}

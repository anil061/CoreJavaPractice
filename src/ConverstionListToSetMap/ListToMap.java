package ConverstionListToSetMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "HR"));
        employees.add(new Employee(2, "Bob", "IT"));
        employees.add(new Employee(3, "Alice", "HR")); // duplicate

        Map<Integer, Employee> empMap = employees.stream()
                                               .collect(Collectors.toMap(Employee::getId, employee -> employee));
        System.out.println("Converted to MAP " + empMap);
        //To Avoid duplicates
        Stream<Employee> employeeStream = employees.stream();
        Set<Employee> convertToSet = employeeStream.collect(Collectors.toSet());
        System.out.println("convertToSet==>" + convertToSet);
    }
}

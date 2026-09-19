package ListOfEmployees;

import camparableAndComparator.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));
        students.add(new Student(2, "Bobby"));

          Map<Integer, String> studentMap =students.stream()
                   .collect(Collectors.toMap(
                           Student::getId,
                           Student::getName,
                           (oldValue, newValue)->oldValue
                   ));

        System.out.println("List to Map (keeping old value for duplicate key): " + studentMap);
        Map<Integer, List<Student>> studentGroupById = students.stream()
                .collect(Collectors.groupingBy(Student::getId));

        System.out.println("List to Map (grouped by ID): " + studentGroupById);

    }
}

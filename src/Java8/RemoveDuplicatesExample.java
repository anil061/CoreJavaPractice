package Java8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesExample {
    public static void main(String[] args) {
        List<DuplicateEmployee> employees = Arrays.asList(
                new DuplicateEmployee(1, "Anil"),
                new DuplicateEmployee(2, "John"),
                new DuplicateEmployee(3, "Sara"),
                new DuplicateEmployee(1, "Anil"),  // duplicate by id
                new DuplicateEmployee(2, "Johnny") // same id, different name
        );
        List<DuplicateEmployee> uniqueList = employees.stream().distinct().collect(Collectors.toList());
        System.out.println("removing duplicate from employee using distinct" + uniqueList);
        Set<DuplicateEmployee> uniqueSet = new LinkedHashSet<>(employees);
        System.out.println("removing duplicates by using set" + uniqueSet);
    }
}

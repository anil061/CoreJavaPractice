package Java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class grouping {
    public static void main(String[] args){

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

         Map<Integer, List<String>> integerListMap = ohMy.collect(groupingBy(String:: length));
        System.out.println("Using List " + integerListMap);
        Map<Integer, Set<String>> mapWithSet = ohMy.collect(groupingBy(String::length, Collectors.toSet()));
        System.out.println("using Set as final output" + mapWithSet);
        TreeMap<Integer, Set<String>> treeMapRef =  ohMy.collect(groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println("using treemap" + treeMapRef);


    }
    public void getEmployee(){
        List<Employee> employees = Stream.of(
                new Employee(1, "Datta", "dev", 5000),
                new Employee(1, "Daya", "dev", 10000),
                new Employee(1, "Nagaraju", "QA", 6000),
                new Employee(1, "Manasa", "devops", 15000),
                new Employee(1, "saibaba", "dev", 25000)
        ).collect(Collectors.toList());
        Map<String, List<Employee>> empMap = employees.stream().collect(groupingBy(Employee::getDept));
        System.out.println(empMap);
    }
}

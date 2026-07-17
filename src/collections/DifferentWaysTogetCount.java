package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DifferentWaysTogetCount {
    public static void main(String[] args) {
       List<Types> listType = new ArrayList<>();
       Types t1 = new Types("banana", "yellow");
        Types t2 = new Types("orange", "Red");
        listType.add(t1);
        listType.add(t2);


        long countOfTypes = listType.stream()
                .filter(it -> it.getType().equalsIgnoreCase("orange"))
                .count();
        Map<String, Long> collect = listType.stream()
                .collect(Collectors.groupingBy(Types::getType, Collectors.counting()));
         collect.entrySet().forEach((x)->{;
             System.out.println( x.getKey() + " " + x.getValue() );
         });

        Map<String, Long> collect2 = listType.stream()
                .map(Types::getType)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect2.forEach((type,count)->{
            System.out.println(type + " " + count);
        });

        List<String> listOfString = Arrays.asList("A", "B", "A", "C", "B", "A");
        Map<String, Long> collect3 = listOfString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect3.forEach((x,y)->{
            System.out.println("x value " + x + " : Count of X Value:: " + y);
        });
        System.out.println();
        System.out.println("countOfTypes===>" + countOfTypes);

    }
}

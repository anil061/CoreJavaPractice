package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args){
        List<String> stringList= new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("keshav");
        stringList.add("narayana");
        stringList.add("madhava");

        Set<String> uniqueElements = new HashSet<>();
         Set<String> duplicates = stringList.stream().filter(n -> !uniqueElements.add(n)).collect(Collectors.toSet());
        System.out.println("duplicate values ::"+ duplicates);

        Map<String, Long> mapofList = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("MapofList:: " + mapofList);


        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 7, 8, 5, 9};

        Map<Integer, Long> numberCountMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("numberCounbtMap" + numberCountMap );

    }
}

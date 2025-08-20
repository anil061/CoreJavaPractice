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

        //Find Duplicate from stringList
        stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((x,y)-> {
                    System.out.println("x " + x + " y" + y);
                });

        //Find Unique elements in List
        Map<String, Long> uniqueElement = stringList.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        List<String> singleValueFromList = uniqueElement.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Unique Element " + singleValueFromList);

        Set<String> removeDuplicatesUsingSet = stringList.stream().collect(Collectors.toSet());
        System.out.println("remove duplicates using values set::"+ removeDuplicatesUsingSet);
        Map<String, Long> mapofList=  stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapofList.forEach((x,y)->{
            System.out.println(x + " " + y);
        });

        //Map<String, Long> mapofList = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("MapofList:: " + mapofList);


        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 7, 8, 5, 9};

        Map<Integer, Long> numberCountMap = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("numberCounbtMap" + numberCountMap );

    }
}

package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        int[] num = {1,3,6,8,6,3,6,9,10};
        Map<Integer, Long> frequencyOfNumbers = Arrays.stream(num).
                boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyOfNumbers.entrySet().stream()
                .filter(entry-> entry.getValue() > 1)
                .forEach(entry -> {
                    System.out.println(entry.getKey() + " Occurs " + entry.getValue());
                });

        //Without using native methods
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i =0; i < num.length ; i++){
             int current = num[i];
             if(countMap.containsKey(current)){
                countMap.put(current, countMap.get(current)+1);
             } else{
                 countMap.put(current, 1);
             }

        }
        System.out.println("Repeated numbers with count:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
      DuplicateString();

    }
    public static void DuplicateString(){
        String[] value  = {"LWD", "PWD", "lwd","FICO", "lifo", "LIFO", "USD", "usd"};
        Map<String, Long> frequency = Arrays.stream(value)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        Map<String, Long> duplicates = frequency.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("duplicates ==>" + duplicates);

    }
}

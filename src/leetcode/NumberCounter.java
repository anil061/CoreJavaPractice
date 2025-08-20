package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberCounter {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,3,3,3,5,5,5,7,7,7};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int n: numbers){
            Integer currentCount = frequencyMap.get(n);
            if(currentCount == null){
               frequencyMap.put(n, 1);
            } else{
                frequencyMap.put(n, currentCount+1);
            }
        }

        System.out.println("Number - Count");
        System.out.println("--------");
        for(Map.Entry<Integer, Integer> map: frequencyMap.entrySet()){
            System.out.println(map.getKey() + " - " + map.getValue());
        }
        Map<Integer, Long> numberAndThereCount = Arrays.stream(numbers).sorted().boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        numberAndThereCount.forEach((num, count)->{
            System.out.println("Number ::: " + num + " Count of Number " + count);
        });
    }
}

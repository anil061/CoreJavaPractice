package InterviewPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedDigitsCounterJava8 {
    public static void main(String[] args) {
        long number = 122334455677887L;

        String numberStr = Long.toString(number);

        Map<Character, Long> digitCountMap = numberStr.chars()
                .mapToObj( c-> (char) c)
                .collect(HashMap:: new, (map,digit)-> map.merge(digit, 1L, Long::sum), HashMap::putAll);

        // Count the number of repeated digits
        long repeatedDigitsCount = digitCountMap.values().stream()
                .filter(count -> count > 1)
                .count();

        System.out.println("Total number of repeated digits: " + repeatedDigitsCount);
        // Print how many times each digit is repeated
        System.out.println("Digits and their counts:");
        digitCountMap.forEach((digit, count)-> {
            if(count > 1){
                System.out.println(digit + ": " + count);
            }
        });

        Map<Character, Long> alternativeCount = numberStr.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        alternativeCount.forEach((x,y)->{
            System.out.println("number x " + x + " Count Y " + y);
        });

    }
}

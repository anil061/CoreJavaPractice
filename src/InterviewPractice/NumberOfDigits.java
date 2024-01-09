package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class NumberOfDigits {
    public static void main(String[] args){
        int number = 123456;
        int count = 0;
        while (number >0){
            number = number/10;
            count++;
        }
        System.out.println(" Count value "+count);
        long repeatedNumber = 123455566677888999L;
        Map<Character, Integer> digitCountMap = new HashMap<>();
        String numberStr = Long.toString(repeatedNumber);
        for(char digitChar: numberStr.toCharArray()){
            digitCountMap.put(digitChar, digitCountMap.getOrDefault(digitChar,0) +1);
        }
        int repeatedDigitsCount = 0;
        for(int repCount: digitCountMap.values()){
            if(repCount > 1){
                 repeatedDigitsCount++;
            }
        }
        System.out.println("Number of repeated digits: " + repeatedDigitsCount);

        System.out.print("Repeated digits: ");
        for(Map.Entry<Character, Integer> entry: digitCountMap.entrySet()){
           if(entry.getValue() > 1){
               System.out.println(entry.getValue() + " ");
           }
        }
    }
}

package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* String var ="This is The Example to find the count of each character in the sentence";
* */
public class CharCountInString {
    public static void main(String[] args) {
        String value ="This is The Example to find the count of each character in the sentence";

        Map<Character, Long> frequencyOfChars = value.toLowerCase().chars().mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        frequencyOfChars.forEach((k,v)-> System.out.println(k + " :: " + v));
        countofStrings(value);
    }

    private static void countofStrings(String input) {
        String lowerCase = input.toLowerCase();
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);

            if (Character.isWhitespace(c)) {
                continue;
            }
            if(frequencyMap.containsKey(c)){
              frequencyMap.put(c, frequencyMap.get(c)+1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        //To print result
        for(Map.Entry<Character, Integer> entry: frequencyMap.entrySet()){
            System.out.println(entry.getKey() + "===" + entry.getValue());
        }

    }


}

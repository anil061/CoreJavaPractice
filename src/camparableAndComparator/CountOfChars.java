package camparableAndComparator;

import java.util.*;
import java.util.stream.Collectors;

public class CountOfChars {
    public static void main(String[] args) {
        String s = "Abcabcdef";
        Integer[] in = {1,1,1,3,9,4,4,4,5,5,5,6};
        String s1 = s.toLowerCase();
        boolean result  = repeatedChars(s1);
        printRepeatedChars(s1);
        countOfCharUsingStream(in);
        countOfCharUsingStream1(in);
    }
    public static boolean repeatedChars(String str){
        Set<Character> visted = new HashSet<>();
        for(char ch: str.toCharArray()){ //
            if(visted.contains(ch)){
                return true;
            }
            visted.add(ch);
        }
        return false;
    }


    public static void printRepeatedChars(String str) {
        Set<Character> visited = new HashSet<>();
        Set<Character> repeated = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (!visited.add(ch)) { // if already in visited → repeated
                repeated.add(ch);
            }
        }

        if (repeated.isEmpty()) {
            System.out.println("No repeated characters.");
        } else {
            System.out.println("Repeated characters (unique only): " + repeated);
        }
    }
    public static void countOfCharUsingStream(Integer[] str){
        /*Map<Character, Long> usingStream = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c, Collectors.counting()
                ));
        System.out.println("usingStream==> " + usingStream);
        Map<Character, Long> dupicates = usingStream.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("dupicates===>" + dupicates);*/

        Map<Integer, Long> intCount = Arrays.stream(str).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
              intCount.entrySet().stream()
                      .filter(x->x.getValue() > 1)
                      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("intCount===>" + intCount);
    }

    public static void countOfCharUsingStream1(Integer[] intAr){

        Map<Integer, Long> intCount = Arrays.stream(intAr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
           intCount.entrySet().stream()
                   .filter(x->x.getValue()>1)
                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Practice IntCoun "+ intCount);
    }
}

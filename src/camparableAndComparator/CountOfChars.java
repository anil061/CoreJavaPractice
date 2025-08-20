package camparableAndComparator;

import java.util.*;
import java.util.stream.Collectors;

public class CountOfChars {
    public static void main(String[] args) {
        String s = "Abcabcdef";
        String s1 = s.toLowerCase();
        boolean result  = repeatedChars(s1);
        printRepeatedChars(s1);
        countOfCharUsingStream(s1);
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
    public static void countOfCharUsingStream(String str){
        Map<Character, Long> usingStream = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c, Collectors.counting()
                ));
        System.out.println("usingStream==> " + usingStream);
        Map<Character, Long> dupicates = usingStream.entrySet().stream()
                .filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("dupicates===>" + dupicates);

    }
}

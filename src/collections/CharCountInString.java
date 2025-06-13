package collections;

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
        frequencyOfChars.forEach((k,v)-> System.out.println(k + " ::" + v));
    }
}

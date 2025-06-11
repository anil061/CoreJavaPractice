package InterviewPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";
        Character result = findFirstNonRepeatingChar(input);
        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static Character findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
          charCount.put(c, charCount.getOrDefault(c,0) + 1);
        }
        for(Map.Entry<Character,Integer> entry: charCount.entrySet()){
            if (entry.getValue() ==1){
                return entry.getKey();
            }
        }
        return null;
    }
}

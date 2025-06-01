package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longest = findLongestUniqueSubString(input);
        System.out.println("Longest substring without repeating characters: " + longest);
    }

    private static String findLongestUniqueSubString(String input) {
        int start = 0;
        int maxLength =0;
        int startIndex = 0;
        Map<Character, Integer> seen = new HashMap<>();
        for(int end =0; end < input.length(); end++){
             char current = input.charAt(end);
            // If character was seen, move start to the right of its last occurrence
            if (seen.containsKey(current) && seen.get(current) >= start) {
                start = seen.get(current) + 1;
            }
            seen.put(current, end);
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startIndex = start;
            }
        }
        return input.substring(startIndex, startIndex + maxLength);
    }
}

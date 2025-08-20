package InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longest = findLongestUniqueSubString(input);
        System.out.println("Longest substring without repeating characters: " + longest);
    }

    private static String findLongestUniqueSubString(String str){
        int start = 0;
        int maxLength = 0;
        int startIndex = 0;
        Map<Character, Integer> visited =new HashMap<>();
        for(int end = 0; end <str.length(); end++){
            char currentChar = str.charAt(end);
            if(visited.containsKey(currentChar) && visited.get(currentChar) >= start){
                    start= visited.get(currentChar) + 1;
            }
            visited.put(currentChar, end);
            if(end - start + 1 > maxLength){
                maxLength = end - start + 1;
                startIndex = start;
            }
        }
        String loggestUniqueSubString = str.substring(startIndex, startIndex + maxLength);
        System.out.println("Longest unique substring: " + loggestUniqueSubString);
        int count = 0;
        for(int i = 0; i <= str.length()-loggestUniqueSubString.length(); i++){
            if(str.substring(i, i + loggestUniqueSubString.length()).equals(loggestUniqueSubString)){
              count++;
            }
        }
        System.out.println("Occurrence count: " + count);
        return str.substring(startIndex, startIndex + maxLength);
    }

    /*private static String findLongestUniqueSubString(String input) {
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
    }*/
}

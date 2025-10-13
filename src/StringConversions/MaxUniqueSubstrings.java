package StringConversions;

import java.util.HashSet;
import java.util.Set;

public class MaxUniqueSubstrings {
    public static void main(String[] args) {
        String str = "abcaefgha";
        int count =1 ;
        boolean[] seen = new boolean[256];
        for(char ch: str.toCharArray()){
            if(seen[ch]){
                count++;
                seen = new boolean[256];
            }
            seen[ch] = true;
        }
        alternativeMethod(str);
        System.out.println("Max SubString: "+ count);
    }

    private static void alternativeMethod(String str) {
        Set<Character> seen = new HashSet<>();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(Character ch: str.toCharArray()){
            if(seen.contains(ch)){
                count++;
            }
            seen.add(ch);
            sb.append(ch);
        }
        System.out.println("Max unique Substings " + count);
    }
}

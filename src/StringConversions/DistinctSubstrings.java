package StringConversions;

import java.util.HashSet;
import java.util.Set;

public class DistinctSubstrings {
    public static void main(String[] args) {
        String s = "aabb";
        Set<String> subString = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i +1; j<=s.length(); j++){
                  subString.add(s.substring(i,j));
            }
        }
        System.out.println("Distinct substrings  ==>" + subString);
        System.out.println("Count: " + subString.size());
    }
}

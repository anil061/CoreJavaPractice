package leetcode;

import java.util.*;

public class ArryaListDemo {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(String word: input){
            char[] chars= word.toCharArray();
            Arrays.sort(chars);
            System.out.println(chars);
            String s = new String(chars);
            map.computeIfAbsent(s, k-> new ArrayList<>()).add(word);
        }
        System.out.println(map.values());
    }

}

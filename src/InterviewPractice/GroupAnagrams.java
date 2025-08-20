package InterviewPractice;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] words = {"cat", "tac", "atc", "map", "pam", "vim"};
// Map with sorted word as key
        Map<String, List<String>> anagramGroups = new HashMap<String, List<String>>();
        for(int i=0; i < words.length; i++){
            String word = words[i];
            String soretedKey = sortedCharacters(word);
            if(!anagramGroups.containsKey(soretedKey)){
                anagramGroups.put(soretedKey, new ArrayList<String>());
            }
            anagramGroups.get(soretedKey).add(word);
        }
        //Out put
        for(List<String> group: anagramGroups.values()){
            System.out.println(group);
        }
    }

    private static String sortedCharacters(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}

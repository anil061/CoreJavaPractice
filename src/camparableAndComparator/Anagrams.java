package camparableAndComparator;

import java.util.Arrays;

//SILENT, LISTEN
public class Anagrams {
    public static void main(String[] args) {
        String s1 = "SILENT";
        String s2 = "LISTEN";
        Boolean result = isAnagrams(s1,s2);
        if(result){
            System.out.println(" S1 " + s1 + " S2 are Anagrams: " + s2);
        } else {
            System.out.println("s1, s2 are not anagrams");
        }
    }

    private static boolean isAnagrams(String s1, String s2) {
       String str1 = s1.toLowerCase();
       String str2 = s2.toLowerCase();
       if(str1.length() != str2.length()){
           return false;
       }
        char[] char2 = str2.toCharArray();
        char[] char1 = str1.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}

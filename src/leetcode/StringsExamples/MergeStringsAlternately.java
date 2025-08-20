package leetcode.StringsExamples;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqrs";
        String result = mergeStringAlternatively(s1, s2);
        System.out.println("result " + result);
    }

    private static String mergeStringAlternatively(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int i =0,j=0;
        while(i < s1.length() || j < s2.length()){
            if(i < s1.length()){
                merged.append(s1.charAt(i));
                i++;
            }
            if(j < s2.length()){
                merged.append(s2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }
}

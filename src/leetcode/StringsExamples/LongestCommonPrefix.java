package leetcode.StringsExamples;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //String s = "abbbcccceeeeeeedddd";
        String[] strArr = { "geeksforgeeks", "geeks", "geek", "geezer" };
        String result = longestCommonPrefix(strArr);
        System.out.println("result " + result);
    }

    private static String longestCommonPrefix(String[] strArr) {
       if(strArr == null || strArr.length == 0)
           return "";
       String prefix = strArr[0];
       for(int i = 0; i < strArr.length; i++){
           while(strArr[i].indexOf(prefix) != 0) {
               prefix = prefix.substring(0, prefix.length() - 1);
           }
       }
       return prefix;
    }
}

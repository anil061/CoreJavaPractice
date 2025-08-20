package leetcode.StringsExamples;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "bab";
       String isPalindrome =  longestPalindrome(s);
    }

    private static String longestPalindrome(String s1) {
        if(s1 == null || s1.length() < 1 )
            return null;
        int start = 0, end =0;
        for(int i =0; i<s1.length(); i++){
            int len1 = expandArround(s1, i, i);
            int len2 = expandArround(s1, i, i ++);
            int len = Math.max(len1, len2);
            if(len > end-start){
              start = i- (len-1)/2;
              end = i + len/2;
            }
        }
        return s1.substring(start, end+1);
    }

    private static int expandArround(String s1, int left, int right) {
        while(left >= 0 && right< s1.length() && s1.charAt(left) == s1.charAt(right)){
          left--;
          right++;
        }
        return right-left-1;
    }


}

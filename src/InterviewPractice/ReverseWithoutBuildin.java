package InterviewPractice;

public class ReverseWithoutBuildin {
    public static void main(String[] args) {
        String s = "Datta";
        String buildinRevers = new StringBuilder(s).reverse().toString();
        System.out.println("buildinRevers =====>" + buildinRevers);
        char[] split;
        split = s.toCharArray();
        int left = 0;
        int right = split.length -1;
        while(left < right){
           char temp = split[left];
           split[left] = split[right];
           split[right] = temp;
           left++;
           right--;
        }
        String result = "";
        for (char c : split) {
            result += c; // avoid in real code due to performance; use StringBuilder
        }

        System.out.println("reverse String ====> " + result);

        String s1 = "madam";
        boolean isPalindrome= isPalindrome(s1);
        System.out.println("isPalindrome=====>" + isPalindrome);
    }

    private static boolean isPalindrome(String s1) {
        String palindromString = new StringBuilder(s1).reverse().toString();
        return s1.equals(palindromString);
    }
     /*Count the number of */

}

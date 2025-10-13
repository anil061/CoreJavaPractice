package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Friday", "Monday");
        System.out.println(list.toString());
          Collections.reverse(list);
        System.out.println(list.toString());
        //Revere the sting values
        String s1 = "anil";
        char[] charArray = s1.toCharArray();
        String reverse = "";
        for(int i = s1.length()-1; i>=0 ; i-- ){
          reverse += s1.charAt(i);
        }
        System.out.println(reverse);
    }
}

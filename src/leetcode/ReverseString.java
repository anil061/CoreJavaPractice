package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args){
        List<String> list = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Sunday", "Monday");
        System.out.println(list.toString());
          Collections.reverse(list);
        System.out.println(list.toString());
    }
}

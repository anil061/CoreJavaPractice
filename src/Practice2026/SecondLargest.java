package Practice2026;

import java.sql.SQLOutput;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 35,1};
        System.out.println(SecondLargest.secondHighestNum(arr));
        System.out.println("Second Way to print Largest Number: " + SecondLargest.secondMethod(arr));
    }

    static String secondMethod(int[] arr) {
      int first = Integer.MIN_VALUE;
      int second = Integer.MIN_VALUE;
      for(int n: arr){
          if(n>first){
              second = first;
              first = n;
          } else if(n>second && n != first){
              second = n;
          }
      }
      return String.valueOf(second);
    }

    static int secondHighestNum(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr.length);
        int largestNumber = arr[arr.length-1];
        System.out.println("First Largest Number :" + largestNumber);
        for (int i = arr.length-2; i>=0; i--){
            if(arr[i] !=largestNumber){
                return arr[i];
            }
        }
        return -1;
    }
}
package InterviewPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KthLargest {
    public static void main(String[] args) {
        int[] ar = {10, 4, 3, 50, 23, 90};
        int count = ar.length;

        System.out.println("Lenght of the array ==>" + count);
        int k = 3;
        oldversionOfJava(ar, k);
        int kthLagerValues = Arrays.stream(ar).boxed()
                .sorted((a,b)-> b-a)
                .skip(k-1)
                .findFirst()
                .get();
        System.out.println("kthLagerValues===>" + kthLagerValues);
    }

    private static void oldversionOfJava(int[] ar, int k) {
        int count = ar.length;
        Arrays.sort(ar);
        int kthLargest = ar[count-k];
        System.out.println("Older version of java ==>" + kthLargest);
    }
}

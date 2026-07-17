package DSA;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20,30,40};

        // Sort the array before searching
        Arrays.sort(arr);

        // Perform binary search for the specified values
        System.out.println("Searching for 20 in arr: "
                + Arrays.binarySearch(arr, 20));
        System.out.println("Searching for 40 in arr: "
                + Arrays.binarySearch(arr, 40));

    }
}

package SortingDemos;

import java.util.Arrays;

public class CountingSortExample {
    public static void main(String[] args) {
        int[] arr = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};

        System.out.println("Original Array: " + Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }

    private static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min +1;

        int[] count = new int[range];
        for(int num: arr){
           count[num-min]++;
        }
        //Reconsutruct array
        int index = 0;
        for(int i =0; i< range; i++){
             while(count[i] > 0){
                 arr[index++] = i + min;
                 count[i]--;
             }
        }
    }
}

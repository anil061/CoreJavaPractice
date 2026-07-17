package Practice2026;

import java.util.Arrays;

public class missingNumInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        System.out.println(missingNum(arr));
    }

    private static int missingNum(int[] arr) {
        Arrays.sort(arr);
        if(arr[0]>1){
          return arr[0]-1;
        }
        for(int i =0; i< arr.length-1; i++){
            if(arr[i+1]-arr[i] !=1){
                return arr[i]+1;
            }
        }
        return arr[arr.length-1]+1;
    }
}

package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);

        System.out.println("Returned k: " + k);
        System.out.print("Modified nums: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n Full array after modification: " + Arrays.toString(nums));
    }

    private static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int k =2;
        for (int i =0; i < nums.length; ){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

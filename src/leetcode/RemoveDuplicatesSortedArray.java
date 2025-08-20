package leetcode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicatesSortedArray {
    static int[] nums = {1, 1, 2};
    public static void main(String[] args) {

        int k = removeDuplicates(nums);
         RemoveDuplicatesSortedArray.removeDuplicatesUsingOldJava(nums);

        System.out.println("Returned k: " + k);
        System.out.print("Modified nums: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n Full array after modification: " + Arrays.toString(nums));
    }

    private static void removeDuplicatesUsingOldJava(int[] nums) {
        Set<Integer> unique = new LinkedHashSet<>();
        for(int n: nums){
            unique.add(n);
        }
        int[] uniqueArray = new int[unique.size()];
        int i =0;
        for(int num: unique){
            uniqueArray[i++] = num;
        }
        System.out.println("After removing duplicates ==>" + Arrays.toString(uniqueArray));
    }

    private static int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        Map<Integer, Long> duplicates = Arrays.stream(nums).sorted().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
         duplicates.entrySet().forEach((x)->{
             System.out.println(x.getKey() + " count " + x.getValue());
         });
        return 0;
    }




    /*private static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int k =2;
        for (int i =0; i < nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }*/
}

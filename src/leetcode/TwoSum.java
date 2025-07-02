package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] num1 = {2,7,11,15};
        int t1 = 9;
        int[] num2 = {3,2,4};
        int t2 = 6;
        System.out.println("Out put of arrays"+ Arrays.toString(twoSum(num1, t1)));
    }
    public static int[] twoSum(int[] nums, int target){
          Map<Integer, Integer> map = new HashMap<>();
          for(int i= 0; i < nums.length; i++){
                int complement = target - nums[i];
                if(map.containsKey(complement)){
                    return  new int[] {map.get(complement), i};
                }
                map.put(nums[i], i);
          }
        return new int[]{};
    }
}

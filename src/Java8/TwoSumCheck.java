package Java8;

import java.util.HashSet;
import java.util.Set;

public class TwoSumCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        boolean result = hasTwoSum(arr, target);
        if(result){
            System.out.println("Found Distinct numbers" + target);
        }else{
            System.out.println("No distict value " + target);
        }
    }

    private static boolean hasTwoSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for(int num: arr){
            int complement = target-num;
            if(seen.contains(complement)){
                System.out.println("Example pair " + num + " " + complement);
                return true;
            }
            seen.add(num);
        }
        return  false;
    }
}

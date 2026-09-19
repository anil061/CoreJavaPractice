package Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Testclass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1,-2,-3,-4,3,4,5,10,-11,-2,12,13,14,15};
        Arrays.sort(arr);
        Set<Integer> visti = new HashSet<>();
        Set<Integer> dup = new LinkedHashSet<>();

        for(int num: arr){
            if(!visti.add(num))
                dup.add(num);

        }
        System.out.println(dup);
    }
}



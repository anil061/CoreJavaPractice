package InterviewPractice;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args){
        int[] num = {1,2,3};
     List<List<Integer>> result = permute(num);
        System.out.println("Permutations " + result);
    }

    private static List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used =  new boolean[num.length];
        generatePermutations(num, used, current, result);
        return result;
    }

    private static void generatePermutations(int[] num, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == num.length){
          result.add(new ArrayList<>(current));
          return;
        }
        for (int i=0; i< num.length; i++){
        if(used[i]){
           continue;
        }
            current.add(num[i]);
            used[i] = true;

            generatePermutations(num, used, current, result);

            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}

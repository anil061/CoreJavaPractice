package InterviewPractice;

import java.util.Arrays;

public class swapinarrays {
    public static void main(String[] args) {
        int[] s1 = {1,2,3,4,5};

        int left = 0;
        int right = s1.length -1;
        while(left < right){
            int temp = s1[left];
            s1[left] = s1[right];
            s1[right] = temp;
            left++;
            right--;
        }
        System.out.println();
            System.out.println(Arrays.toString(s1) + " ");

    }
}

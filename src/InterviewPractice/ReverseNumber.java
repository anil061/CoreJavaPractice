package InterviewPractice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number " + num);
        int reverseNumber = ReverseNumber.extracted(num);
        System.out.println("ReverseNumber " + reverseNumber);
        sc.close();
    }

    private static int extracted(int number) {
        int reverseNum = 0;
        while(number !=0){
            int digit = number % 10;
            reverseNum = reverseNum * 10 + digit;
            number /= 10;
        }
        return reverseNum;
    }
}

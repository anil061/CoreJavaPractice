package InterviewPractice;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter a number " + num);
        int reverseNumber = ReverseNumber.extracted(num);
        int numReverse = ReverseNumber.numExtracted(num);
        System.out.println("ReverseNumber " + reverseNumber);
        System.out.println("numReverse " + numReverse);
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

    private static int numExtracted(int number){
        int reverseNo = 0;
        while(number != 0){
            int d = number % 10;
            reverseNo = reverseNo * 10 + d;
            number /=10;
        }
        return reverseNo;
    }
}

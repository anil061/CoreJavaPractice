package InterviewPractice;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int givenNumber = sc.nextInt();

        if(isArmstrongNumber(givenNumber)){
            System.out.println(givenNumber + " Is  a Armstrong Number");
        } else {
            System.out.println(givenNumber + " Is not a Armstrong Number");
        }
    }

    private static boolean isArmstrongNumber(int givenNumber) {
        int originalNumber, remainder, result =0, n= 0;
        originalNumber = givenNumber;
        while(originalNumber !=0){
            originalNumber /= 10;
            ++n;
        }
        originalNumber = givenNumber;
        //Calculate the sum of digits, each raised to power of n
        while (originalNumber !=0){
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /=10;
        }
        return result == givenNumber;
    }
}

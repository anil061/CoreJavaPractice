package InterviewPractice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        sc.close();
        if(isPalindrom(number)){
            System.out.println(number + " is a palindrome");
        } else{
            System.out.println(number + " is not a palindrome");
        }
    }

    private static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reverseNumber = 0;
        while(number !=0){
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + number % 10;
            number = number/10;
        }
        return originalNumber == reverseNumber;
    }
}

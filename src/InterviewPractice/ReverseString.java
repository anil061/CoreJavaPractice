package InterviewPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String stringExample;
        System.out.println("Original String ");
        Scanner sc = new Scanner(System.in);
        stringExample = sc.nextLine();
        sc.close();
        String reversedString = reverseString(stringExample);
        System.out.println("Reversed string: " + reversedString);
    }

    private static String reverseString(String stringExample) {
        if (stringExample.isEmpty()) {
            return stringExample;
        }
        return reverseString(stringExample.substring(1)) + stringExample.charAt(0);
    }
}

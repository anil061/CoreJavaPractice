package InterviewPractice;

import java.util.Scanner;


public class ReversePyramidPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the rows to print:");
        int rows = sc.nextInt();
        sc.close();
        System.out.println("Printing Reverse Pattern 1\n");
        printPatternExample(rows);
    }

    private static void printPatternExample(int rows) {
        // for loop for the rows
        for (int i = rows; i >= 1; i--) {
            // white spaces in the front of the numbers
            int numberOfWhiteSpaces = rows - i;

            //print leading white spaces
            printStringValue(" ", numberOfWhiteSpaces);

            //print numbers
            printStringValue(i + " ", i);

            //move to next line
            System.out.println("");
        }
    }

    private static void printStringValue(String s, int times) {
        for (int j =0; j<=times; j++){
            System.out.println(s);
        }
    }
}

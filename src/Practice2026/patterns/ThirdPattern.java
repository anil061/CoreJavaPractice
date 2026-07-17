package Practice2026.patterns;

import java.util.Scanner;

public class ThirdPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Print number of rows and columns " + n);
        printNumbers(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        //pattern9 - combine pattern7,8
        pattern10(n);
        pattern11(n);
    }

    private static void pattern11(int n) {
        System.out.println("Pattern 11");
        //even rows start wit 1,
        int start = 1;
        for(int i =0;  i< n; i++){
            if(i % 2 ==0 ) start =1;
            else start =0;
            for(int j =0; j<=i; j++){
                System.out.print(start);
                start = 1-start; // flip the 0 to 1 to zero
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        System.out.println("Pattern 10");
        for(int i =1; i<=2*n-1; i++){
          int stars = i;
          if(i > n) stars = 2*n -i;
          for(int j =1; j<=stars; j++){
              System.out.print("*");
          }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
       //Space Star Space
        System.out.println("Pattern 8");
        for(int i =0; i<n; i++){
            // spaces
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            // star
            for(int j =0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            // spaces
            for(int j =0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
        System.out.println("Pattern 7");
        for(int i =0; i<n; i++){
            // spaces
            for(int j =0; j<= n-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int j =0; j<2*i+1; j++){
                System.out.print("*");
            }
            // spaces
            for(int j =0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        System.out.println("Pattern 6");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        System.out.println("Pattern 5");
        for(int i=1; i<=n; i++){
          for(int j=0; j< n-i+1; j++ ){
              System.out.print("* ");
          }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        System.out.println("Pattern 4");
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }

    private static void printNumbers(int n) {
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

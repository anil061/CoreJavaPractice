package Practice2026.patterns;

import java.util.Scanner;

public class SecondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Print number of rows and columns " + n);
        incrementalPattern(n);
    }

    private static void incrementalPattern(int n) {
        for(int i =0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

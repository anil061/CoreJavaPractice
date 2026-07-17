package Practice2026.patterns;

import java.util.Scanner;

public class FourRowsFourCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of rows to print " + n);
        System.out.println("Print n X n * in output");
        fourByFoure(n);
    }

    private static void fourByFoure(int k) {
        for(int i =0; i <k ; i++){
            for(int j=0; j<k ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

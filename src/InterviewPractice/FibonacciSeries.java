package InterviewPractice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }
        private static int fibonacci(int n) {
            if (n <= 1){
                return n;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
}

package InterviewPractice;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TrainglePatternUsingJavaStream {
    public static void main(String[] args){
        // int row = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for Pyramid *");
        int row = sc.nextInt();
        IntStream.rangeClosed(1, row)
                .mapToObj(i -> " ".repeat(row-i)+"*".repeat(2*i-1))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}

package InterviewPractice;

import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        Stream.generate(()-> "ElSA")
                .filter(n -> n.length() == 2)
                .limit(1)
                .map(n -> n + " - " + n.length())
                .forEach(System.out::println);
    }
    }


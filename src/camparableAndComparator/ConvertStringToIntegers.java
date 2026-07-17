package camparableAndComparator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//List<String> numbersAsString = Arrays.asList("1,2,3", "4,5", "6,7,8");
//Expected output: {1, 2, 3, 4, 5, 6, 7, 8}
public class ConvertStringToIntegers {
    public static void main(String[] args) {
        List<String> numbersAsString = Arrays.asList("1,2,3", "4,5", "6,7,8");
        List<Integer> convertedList = numbersAsString.stream()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .map(Integer::parseInt)
                .toList();

        System.out.println("convertedList===> " + convertedList);
        oldwaytoModify(numbersAsString);
    }

    private static void oldwaytoModify(List<String> numbersAsString) {
        StringBuilder sb = new StringBuilder();

        for (String s : numbersAsString) {
            if (sb.length() > 0) sb.append(",");
            sb.append(s);
        }
        System.out.println("Using String Builder ==>" + sb);
    }

}

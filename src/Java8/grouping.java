package Java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class grouping {
    public static void main(String[] args){

        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");

         Map<Integer, List<String>> integerListMap = ohMy.collect(Collectors.groupingBy(String:: length));
        System.out.println("Using List " + integerListMap);
    Map<Integer, Set<String>> mapWithSet = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println("using Set as final output" + mapWithSet);
      TreeMap<Integer, Set<String>> treeMapRef =  ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println("using treemap" + treeMapRef);

    }
}

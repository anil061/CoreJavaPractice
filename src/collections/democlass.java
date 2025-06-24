package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class democlass {
    public static void main(String[] args) {
       List<Types> listType = new ArrayList<>();
       Types t1 = new Types("banana", "yellow");
        Types t2 = new Types("banana", "Red");


        listType.stream()
                .filter(it -> it.getType().equalsIgnoreCase(it.getType()))
                .count();
    }
}

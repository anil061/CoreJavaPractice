package ConverstionListToSetMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Alice"); // Duplicate
        namesList.add("Charlie");
        System.out.println("Original List" + namesList);

        //Convert List to set
        Set<String> namesSet = new HashSet<>(namesList);
        System.out.println("Converted to set" + namesSet);
    }
}

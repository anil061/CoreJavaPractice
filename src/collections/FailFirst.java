package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFirst {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
        String element = it.next();
            System.out.println(element);
            list.add("c");
        }
    }
}

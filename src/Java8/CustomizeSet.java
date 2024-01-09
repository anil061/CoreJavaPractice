/*
package Java8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CustomizeSet extends AbstractSet {

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        super.forEach(action);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return super.removeIf(filter);
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return super.toArray(generator);
    }

    @Override
    public Spliterator spliterator() {
        return super.spliterator();
    }

    @Override
    public Stream stream() {
        return super.stream();
    }

    @Override
    public Stream parallelStream() {
        return super.parallelStream();
    }

    @Override
    public int size() {
        return 0;
    }
    public static void main(String[] args){
        CustomizeSet customizeSet = new CustomizeSet();
        customizeSet.add();
    }
}
*/

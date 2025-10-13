package Interview;

import java.util.List;

//put("a:,1) : a -> [1]
//put("a:,2) : a -> [1,2]
//put("a:,1) : a -> [1,2,1]
//get("a") : [1,2]
//contains("a",3) : false
/*
Allows multiple values per key.
*/
public interface MultiValueMap<K,V> {
    /*
       Add a value for the given key. Duplicates are allowed
   */
    void put(K key, V value);

    /*  Get all values for the given key in insertion order.
        Returns an empty list if the key is not present.
        The returned list should be unmodifiable
    */
    List<V> get(K key);

    /*
        Check if the map contains the given key-value pair
    */
    boolean contains(K key, V value);

    /*  Remove a single occurrence of the given key-value pair.
        Return true if an entry was removed, false otherwise.
    */
    boolean remove(K key, V value);

    /*
        Return the total number of (key, value) pairs stored in the map.
    */
    int size();
}


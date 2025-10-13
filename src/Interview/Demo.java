package Interview;

import java.util.*;

//put("a:,1) : a -> [1]
//put("a:,2) : a -> [1,2]
//put("a:,1) : a -> [1,2,1]
//get("a") : [1,2]
//contains("a",3) : false
/*
Allows multiple values per key.
*/

//Schema: Orders(id, customer_id, order_date, amount), Customer(id, name, city)

//Q: Find top 5 customers with highest spending in 2025.

//Select coustomer_id , cumstomer_name , customer_amt from Customer cus , Orderer od
 //  Where (Select * from order od )

/*
SELECT
c.id AS customer_id,
c.name,
c.city,
SUM(o.amount) AS total_spent
FROM Orders o
JOIN Customer c
ON o.customer_id = c.id
WHERE YEAR(o.order_date) = 2025
GROUP BY c.id, c.name, c.city
ORDER BY total_spent DESC
LIMIT 5;
*/


public class Demo<K, V> implements  MultiValueMap<K,V>{

   private final Map<K, List<V>> map = new HashMap<>();

    @Override
    public void put(K key, V value) {
        map.computeIfAbsent(key, k-> new ArrayList<>()).add(value);
    }

    @Override
    public List<V> get(K key) {
        return map.getOrDefault(key, Collections.emptyList());
    }

    @Override
    public boolean contains(K key, V value) {
        return map.containsKey(key) && map.get(key).contains(value);
    }

    @Override
    public boolean remove(K key, V value) {
        return map.containsKey(value);
    }

    @Override
    public int size() {
        return 0;
    }
}

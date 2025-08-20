package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByCityExample {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", "New York"),
                new Customer("Bob", "Los Angeles"),
                new Customer("Charlie", "New York"),
                new Customer("Dave", "Chicago"),
                new Customer("Eve", "Los Angeles"),
        new Customer("Ravi", "Los Angeles"),
        new Customer("Rakesh", "Los Angeles"),
        new Customer("Mithun", "Los Angeles"),
        new Customer("Datta", "Los Angeles")
        );
        Map<String, List<Customer>> customersCity = customers.stream()
                .collect(Collectors.groupingBy(Customer::getCity));
        System.out.println("customersCity :"+ customersCity);

        System.out.println("Member of count in city ");
        customersCity.forEach((city, cList)-> {
            System.out.println("City :" + city + "-> CustomerList "+ cList );
        });
         Map<String, Long> ccbycity = customers.stream()
                   .collect(Collectors.groupingBy(Customer::getCity, Collectors.counting()));
        Optional<Map.Entry<String, Long>> maxCity = ccbycity.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        Optional<Map.Entry<String, Long>> minCity = ccbycity.entrySet().stream()
                .min(Map.Entry.comparingByValue());
        maxCity.ifPresent(city-> System.out.println("City with highest members " + city.getKey() + " with " + city.getValue() + " members "));
        minCity.ifPresent(city-> System.out.println("City with lowest members " + city.getKey() + " with " + city.getValue() + " members "));


        /*
        * Group by City and Count Customers*/
        Map<String, Long> customerCountByCity = customers.stream()
                .collect(Collectors.groupingBy(Customer::getCity, Collectors.counting()));
        customerCountByCity.forEach((city, count)->{
            System.out.println("City :" + city + "->Customer Count: "+ count);
        });

        List<Customer> onlyOneCityPeople = customers.stream()
                .filter(x -> x.getCity().equalsIgnoreCase("New York"))
                .collect(Collectors.toList());
        System.out.println("onlyOneCityPeople====>" + onlyOneCityPeople);
    }
}

package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByCityExample {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", "New York"),
                new Customer("Bob", "Los Angeles"),
                new Customer("Charlie", "New York"),
                new Customer("Dave", "Chicago"),
                new Customer("Eve", "Los Angeles")
        );
        Map<String, List<Customer>> customersCity = customers.stream()
                .collect(Collectors.groupingBy(Customer::getCity));
        System.out.println(customersCity);
        customersCity.forEach((city, cList)-> {
            System.out.println("City :" + city + "-> CustomerList "+ cList );
        });
    }
}

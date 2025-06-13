package collections;

import Java8.grouping;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CustomerMain {
    public static void main(String[] args) {
        //List of customer
        //bring the list of customer base on category
        List<Customer> customerList= Arrays.asList(new Customer("P101", "john", "pari", "Dental")
               ,new Customer("P102", "john", "pari", "Dental") ,
                new Customer("P103", "Bob", "kit", "Vision"),
                new Customer("P104", "Titan", "vityan", "Vision"),
                new Customer("P105", "mike", "mit", "Health"));
        List<Customer> listOfVision  = customerList.stream().filter(x -> "Vision".equalsIgnoreCase(x.getCategory()))
                .collect(Collectors.toList());

        Comparator<Customer> compareByCategory = Comparator.comparing(Customer::getCategory);
        Map<String, Optional<Customer>> customerMap = customerList.stream()
                .collect(
                        groupingBy(Customer::getPolicyId, Collectors.reducing(BinaryOperator.maxBy(compareByCategory)))
                );

        System.out.println(customerMap);
    }

}

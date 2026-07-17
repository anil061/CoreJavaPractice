package collections;

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

        Comparator<Customer> comparing = Comparator.comparing(Customer::getCategory);
        Map<String, Optional<Customer>> customerMap = customerList.stream()
                .collect(
                        groupingBy(Customer::getPolicyId, Collectors.reducing(BinaryOperator.maxBy(comparing)))
                );
        System.out.println("customerMap::::" + customerMap);
        System.out.println();
        comparedByCategory();
        /*Comparator<Customer> compareByCategory = Comparator.comparing(Customer::getCategory);
        Map<String, Optional<Customer>> customerMap = customerList.stream()
                .collect(
                        groupingBy(Customer::getPolicyId, Collectors.reducing(BinaryOperator.maxBy(compareByCategory)))
                );

        System.out.println("customerMap:::" + customerMap);*/
    }

    public static void comparedByCategory(){
        List<Customer> customerList1= Arrays.asList(new Customer("P101", "john", "pari", "Dental")
                ,new Customer("P102", "john", "pari", "Dental") ,
                new Customer("P103", "Bob", "kit", "Vision"),
                new Customer("P104", "Titan", "vityan", "Vision"),
                new Customer("P105", "mike", "mit", "Health"));
        Map<String, Optional<Customer>> compareByCategory = customerList1.stream()
                .collect(groupingBy(Customer::getPolicyId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Customer::getCategory)))));
        System.out.println("In Static Method " + compareByCategory);
    }
}

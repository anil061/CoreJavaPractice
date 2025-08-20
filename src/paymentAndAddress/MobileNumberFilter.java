package paymentAndAddress;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MobileNumberFilter {
    public static void main(String[] args) {
        List<Payment> transactions = List.of(
                new Payment("123", "5768", "10", List.of(new Address("Vijay", "123456"))),
                new Payment("1111", "2222", "20", List.of(new Address("Ravi", "987654"))),
                new Payment("333", "4444", "40", List.of(new Address("Anil", "55555")))
        );
        transactions.stream()
                .filter(p -> Integer.parseInt(p.amount()) > 10)
                .collect(Collectors.groupingBy(Payment::addresses))
                .forEach((amt, mobile)->{
                    System.out.println("amt " + amt + "mobile " + mobile);
                });
    }
}

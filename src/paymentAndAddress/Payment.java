package paymentAndAddress;

import java.util.List;

public record Payment(
        String fromAccount,
        String toAccount,
        String amount,
        List<Address> addresses
) {

}

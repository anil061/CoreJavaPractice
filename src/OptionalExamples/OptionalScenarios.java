package OptionalExamples;

import java.util.*;

public class OptionalScenarios {
    public static void main(String[] args) {


    User activeUser = new User("active@email.com", true, new Profile(new Address("New York")));
    User inactiveUser = new User("inactive@email.com", false, new Profile(new Address(null)));
    User nullEmailUser = new User(null, true, new Profile(new Address("Chicago")));

        // 1️⃣ Basic Null Safety
        System.out.println("//  Basic Null Safety->" +
                Optional.ofNullable(activeUser)
                        .map(User::getEmail)
                        .orElse("default@email.com"));

        // 2️⃣ Filtering with Optional
        String filterWithOptional = Optional.ofNullable(inactiveUser)
                .filter(User::isActive)
                .map(User::getEmail)
                .orElse("inactive@company.com");
        System.out.println("filterWithOptional   =>" + filterWithOptional);

        // 3️⃣ Avoiding Nested Null Checks
        String avoidNestedNull = Optional.ofNullable(activeUser)
                .map(User::getProfile)
                .map(Profile::getAddress)
                .map(Address::getCity)
                .orElse("Unknown");
        System.out.println("avoidNestedNull  ==>" + avoidNestedNull);

        // 4️⃣ Throwing Exceptions
        try {
            Optional.ofNullable(nullEmailUser)
                    .map(User::getEmail)
                    .orElseThrow(() -> new RuntimeException("Email Not Found Exception"));
        }catch (Exception e){
            System.out.println("Throws orElse Throw Exception " + e.getMessage());
        }

        // 5️⃣ Optional with Collections
        List<String> names = Arrays.asList("Alice", "Bob");
        String emptyList = Optional.ofNullable(names)
                .filter(list -> !list.isEmpty())
                .map(list -> list.get(0))
                .orElse("Empty List");
        System.out.println("emptyList ==>" + emptyList);

        // 6️⃣ Optional in Streams
        List<Integer> nums = Arrays.asList(5, 15, 25);
        Integer i = nums.stream().filter(n -> n > 10).findFirst().orElse(-1);
        System.out.println("i  ==>" + i);

        // 7️⃣ Chaining Optionals
        System.out.println("7️⃣ Trim & Uppercase → " +
                Optional.ofNullable(" hello ").map(String::trim).map(String::toUpperCase).orElse("N/A"));

        // 8️⃣ Optional + FlatMap
        User userWithAccount = new User("email@x.com", true,
                new Profile(new Address("LA")),
                Optional.of(new Account(2000.50)));
        System.out.println("8️⃣ Balance → " +
                Optional.ofNullable(userWithAccount)
                        .flatMap(User::getAccount)
                        .map(Account::getBalance)
                        .orElse(0.0));

        // 9️⃣ Optional as Method Return Type
        findUserById("123")
                .map(User::getEmail)
                .ifPresent(email -> System.out.println("9️⃣ Found User Email → " + email));

        // 🔟 Combining Optionals
        Optional<String> primary = Optional.empty();
        Optional<String> backup = Optional.of("backup@email.com");
        System.out.println("🔟 Best Email → " +
                primary.or(() -> backup).orElse("No Email"));
    }
    static Optional<User> findUserById(String id) {
        Map<String, User> userDb = new HashMap<>();
        userDb.put("123", new User("found@email.com", true, null));
        return Optional.ofNullable(userDb.get(id));
    }
}

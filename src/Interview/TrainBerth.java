package Interview;

public class TrainBerth {

    // Enum to represent berth types
    enum BerthType {
        LOWER("Lower Berth"),
        MIDDLE("Middle Berth"),
        UPPER("Upper Berth");

        private String description;

        BerthType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    /**
     * Determines the berth type based on the given number
     * Numbers 1, 4, 7, 10... -> Lower Berth
     * Numbers 2, 5, 8, 11... -> Middle Berth
     * Numbers 3, 6, 9, 12... -> Upper Berth
     *
     * @param berthNumber the random number input
     * @return BerthType representing which berth
     */
    public static BerthType getBerthType(int berthNumber) {
        // Validate input
        if (berthNumber <= 0) {
            throw new IllegalArgumentException("Berth number must be positive");
        }

        // Use modulo to find position in cycle (1-3)
        int position = ((berthNumber - 1) % 3) + 1;

        switch(position) {
            case 1:
                return BerthType.LOWER;
            case 2:
                return BerthType.MIDDLE;
            case 3:
                return BerthType.UPPER;
            default:
                throw new IllegalStateException("Unexpected berth position");
        }
    }

    /**
     * Alternative method returning just the description string
     */
    public static String getBerthName(int berthNumber) {
        return getBerthType(berthNumber).getDescription();
    }

    /**
     * Display berth details
     */
    public static void displayBerthInfo(int berthNumber) {
        BerthType berth = getBerthType(berthNumber);
        System.out.println("Berth Number: " + berthNumber);
        System.out.println("Berth Type: " + berth.getDescription());
        System.out.println("---");
    }

    // Main method with examples
    public static void main(String[] args) {
        System.out.println("=== Train Berth Allocation System ===\n");

        // Test with random numbers
        int[] testNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 100};

        for (int num : testNumbers) {
            displayBerthInfo(num);
        }

        // Example with user input simulation
        System.out.println("\n=== Getting specific berth info ===");
        System.out.println("Berth 7: " + getBerthName(7));
        System.out.println("Berth 12: " + getBerthName(12));
        System.out.println("Berth 16: " + getBerthName(16));
        System.out.println("Berth 25: " + getBerthName(25));
        System.out.println("Berth 29: " + getBerthName(29));
    }
}
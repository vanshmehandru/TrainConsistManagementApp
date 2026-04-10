import java.util.*;

// Step 1: Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie class
class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + "(" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            // Valid bogies
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 50));

            // Invalid bogie (will throw exception)
            bogies.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nPassenger Bogies:");
        System.out.println(bogies);
    }
}
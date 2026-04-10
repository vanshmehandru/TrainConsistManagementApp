import java.util.*;
import java.util.stream.*;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Stream → map → reduce
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // sum all

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);

        // Step 4: Original list check
        System.out.println("\nOriginal Bogie List:");
        System.out.println(bogies);
    }
}
import java.util.*;
import java.util.stream.Collectors;

// Base class
class Bogie {
    private String name;   // Sleeper, AC Chair, etc.

    public Bogie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("AC Chair"));
        bogies.add(new Bogie("Sleeper"));
        bogies.add(new Bogie("First Class"));
        bogies.add(new Bogie("AC Chair"));

        // Step 2: Convert to stream and group
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.getName()));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 4: Check original list unchanged
        System.out.println("\nOriginal List:");
        System.out.println(bogies);
    }
}
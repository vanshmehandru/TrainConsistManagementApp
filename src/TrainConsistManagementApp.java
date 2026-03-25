import java.util.*;

// Bogie class representing passenger bogies
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));

        // Step 3: Sort bogies using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies sorted by seating capacity:\n");

        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }
    }
}
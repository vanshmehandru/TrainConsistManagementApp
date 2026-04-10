import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    private String type;   // Cylindrical, Rectangular
    private String cargo;  // Petroleum, Coal, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + "(" + cargo + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create goods bogie list
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));

        // Step 2: Apply safety validation using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        // Step 3: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Step 4: Show original list
        System.out.println("\nGoods Bogies:");
        System.out.println(bogies);
    }
}
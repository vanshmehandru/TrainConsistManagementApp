
import java.util.Arrays;

public class TrainConsistManagementApp {

    public static String[] sortNames(String[] names) {
        Arrays.sort(names);
        return names;
    }

    public static void main(String[] args) {

        String[] names = {"Sleeper", "AC Chair", "First Class"};

        System.out.println("Before: " + Arrays.toString(names));

        sortNames(names);

        System.out.println("After: " + Arrays.toString(names));
    }
}
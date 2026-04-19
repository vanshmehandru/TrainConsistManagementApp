
import java.util.Arrays;

public class TrainConsistManagementApp {

    public static boolean binarySearch(String[] arr, String key) {

        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) return true;
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {

        String[] arr = {"BG309", "BG101", "BG205"};

        System.out.println(binarySearch(arr, "BG205"));
    }
}
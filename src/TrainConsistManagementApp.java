
public class TrainConsistManagementApp {

    public static boolean search(String[] arr, String key) {

        if (arr.length == 0) {
            throw new IllegalStateException("No bogies available");
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] arr = {};

        search(arr, "BG101");
    }
}
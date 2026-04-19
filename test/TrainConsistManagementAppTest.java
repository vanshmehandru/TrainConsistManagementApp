
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};

        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    void testSort_AlreadySorted() {
        int[] arr = {24, 56, 60};

        TrainConsistManagementApp.bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 60}, arr);
    }
}
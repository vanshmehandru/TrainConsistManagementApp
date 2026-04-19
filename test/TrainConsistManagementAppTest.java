
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testBinarySearch_Found() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assertTrue(TrainConsistManagementApp.binarySearch(arr, "BG205"));
    }

    @Test
    void testBinarySearch_NotFound() {
        String[] arr = {"BG101", "BG205"};
        assertFalse(TrainConsistManagementApp.binarySearch(arr, "BG999"));
    }
}
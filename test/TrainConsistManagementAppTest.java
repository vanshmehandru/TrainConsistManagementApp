
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSearch_Found() {
        String[] arr = {"BG101", "BG205", "BG309"};
        assertTrue(TrainConsistManagementApp.linearSearch(arr, "BG309"));
    }

    @Test
    void testSearch_NotFound() {
        String[] arr = {"BG101", "BG205"};
        assertFalse(TrainConsistManagementApp.linearSearch(arr, "BG999"));
    }
}
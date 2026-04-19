

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testThrowsException() {
        String[] arr = {};
        assertThrows(IllegalStateException.class,
                () -> TrainConsistManagementApp.search(arr, "BG101"));
    }

    @Test
    void testSearchWorks() {
        String[] arr = {"BG101", "BG205"};
        assertTrue(TrainConsistManagementApp.search(arr, "BG101"));
    }
}
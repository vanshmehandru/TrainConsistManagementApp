
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSafe() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Cylindrical", "Petroleum")
        );
        assertTrue(TrainConsistManagementApp.isSafe(list));
    }

    @Test
    void testUnsafe() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Cylindrical", "Coal")
        );
        assertFalse(TrainConsistManagementApp.isSafe(list));
    }
}
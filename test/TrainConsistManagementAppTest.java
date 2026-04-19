
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testValidTrain() {
        assertTrue(TrainConsistManagementApp.validateTrain("TRN-1234"));
    }

    @Test
    void testInvalidTrain() {
        assertFalse(TrainConsistManagementApp.validateTrain("TRN-12"));
    }
}
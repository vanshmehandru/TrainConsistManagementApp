
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testValidCapacity() throws Exception {
        TrainConsistManagementApp.Bogie b =
                TrainConsistManagementApp.createBogie(50);
        assertNotNull(b);
    }

    @Test
    void testInvalidCapacity() {
        assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> TrainConsistManagementApp.createBogie(-10)
        );
    }
}
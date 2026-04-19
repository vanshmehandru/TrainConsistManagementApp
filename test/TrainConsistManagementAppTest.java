
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testTotalCapacity() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie(72),
                new TrainConsistManagementApp.Bogie(60),
                new TrainConsistManagementApp.Bogie(40)
        );

        int result = TrainConsistManagementApp.totalCapacity(list);
        assertEquals(172, result);
    }
}
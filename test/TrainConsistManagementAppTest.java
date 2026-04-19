
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSort_BasicAlphabetical() {
        String[] arr = {"Luxury", "General", "Sleeper"};

        String[] result = TrainConsistManagementApp.sortNames(arr);

        assertArrayEquals(new String[]{"General", "Luxury", "Sleeper"}, result);
    }
}
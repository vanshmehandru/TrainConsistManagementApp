
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testPerformanceMethodsRun() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) list.add(i);

        long stream = TrainConsistManagementApp.streamTime(list);
        long loop = TrainConsistManagementApp.loopTime(list);

        assertTrue(stream > 0);
        assertTrue(loop > 0);
    }
}
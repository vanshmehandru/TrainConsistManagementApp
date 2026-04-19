
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testGrouping() {
        List<TrainConsistManagementApp.Bogie> list = Arrays.asList(
                new TrainConsistManagementApp.Bogie("Passenger", 72),
                new TrainConsistManagementApp.Bogie("Passenger", 60),
                new TrainConsistManagementApp.Bogie("Goods", 0)
        );

        Map<String, List<TrainConsistManagementApp.Bogie>> result =
                TrainConsistManagementApp.groupByType(list);

        assertEquals(2, result.get("Passenger").size());
        assertEquals(1, result.get("Goods").size());
    }
}
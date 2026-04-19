package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSafeAssignment() {
        TrainConsistManagementApp.GoodsBogie g =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        g.assignCargo("Petroleum");
        assertEquals("Petroleum", g.cargo);
    }

    @Test
    void testUnsafeAssignmentHandled() {
        TrainConsistManagementApp.GoodsBogie g =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");
        assertNull(g.cargo);
    }
}
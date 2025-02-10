package warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WarehouseItemTest {

    @Test
    void testWarehouseItemProperties() {
        WarehouseItem item = new Electronics("Test Item", 100.0, 12);
        assertEquals("Test Item", item.getName());
        assertEquals(100.0, item.getPrice());
    }
}

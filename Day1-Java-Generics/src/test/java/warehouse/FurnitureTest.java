package warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FurnitureTest {

    @Test
    void testFurnitureProperties() {
        Furniture chair = new Furniture("Chair", 2000, "Wood");
        assertEquals("Chair", chair.getName());
        assertEquals(2000, chair.getPrice());
        assertEquals("Wood", chair.getMaterial());
    }
}

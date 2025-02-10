package warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectronicsTest {

    @Test
    void testElectronicsProperties() {
        Electronics laptop = new Electronics("Laptop", 75000, 24);
        assertEquals("Laptop", laptop.getName());
        assertEquals(75000, laptop.getPrice());
        assertEquals(24, laptop.getWarrantyPeriod());
    }
}

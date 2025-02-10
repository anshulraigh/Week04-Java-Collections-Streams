package warehouse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GroceriesTest {

    @Test
    void testGroceriesProperties() {
        Groceries milk = new Groceries("Milk", 50, "2025-02-20");
        assertEquals("Milk", milk.getName());
        assertEquals(50, milk.getPrice());
        assertEquals("2025-02-20", milk.getExpirationDate());
    }
}

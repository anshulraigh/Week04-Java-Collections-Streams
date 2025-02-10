package warehouse;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StorageTest {

    @Test
    void testAddElectronicsItem() {
        Storage<Electronics> storage = new Storage<>();
        Electronics laptop = new Electronics("Laptop", 75000, 24);
        storage.addItem(laptop);
        List<Electronics> items = storage.getItems();
        assertEquals(1, items.size());
        assertEquals(laptop, items.get(0));
    }

    @Test
    void testAddGroceriesItem() {
        Storage<Groceries> storage = new Storage<>();
        Groceries milk = new Groceries("Milk", 50, "2025-02-20");
        storage.addItem(milk);
        List<Groceries> items = storage.getItems();
        assertEquals(1, items.size());
        assertEquals(milk, items.get(0));
    }

    @Test
    void testAddFurnitureItem() {
        Storage<Furniture> storage = new Storage<>();
        Furniture chair = new Furniture("Chair", 2000, "Wood");
        storage.addItem(chair);
        List<Furniture> items = storage.getItems();
        assertEquals(1, items.size());
        assertEquals(chair, items.get(0));
    }
}

package dynamicmarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClothingCategoryTest {

    @Test
    void testClothingCategory() {
        ClothingCategory category = new ClothingCategory("Casual");
        assertEquals("Casual", category.getType());
    }
}

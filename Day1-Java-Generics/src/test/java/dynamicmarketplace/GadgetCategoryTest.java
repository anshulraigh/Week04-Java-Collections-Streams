package dynamicmarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GadgetCategoryTest {

    @Test
    void testGadgetCategory() {
        GadgetCategory category = new GadgetCategory("TechBrand");
        assertEquals("TechBrand", category.getBrand());
    }
}

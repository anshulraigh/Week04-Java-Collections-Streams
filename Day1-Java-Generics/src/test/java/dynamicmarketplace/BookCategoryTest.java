package dynamicmarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookCategoryTest {

    @Test
    void testBookCategory() {
        BookCategory category = new BookCategory("Fiction");
        assertEquals("Fiction", category.getGenre());
    }
}

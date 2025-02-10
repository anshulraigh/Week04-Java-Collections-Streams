package dynamicmarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DynamicMarketplaceTest {

    @Test
    void testApplyDiscount() {
        Product<BookCategory> book = new Product<>("The Alchemist", 500, new BookCategory("Fiction"));
        DynamicMarketplace.applyDiscount(book, 10);
        assertEquals(450, book.getPrice());
    }
}

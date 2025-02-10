package dynamicmarketplace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testProductCreation() {
        Product<BookCategory> book = new Product<>("The Alchemist", 500, new BookCategory("Fiction"));
        assertEquals("The Alchemist", book.getName());
        assertEquals(500, book.getPrice());
        assertEquals("Fiction", book.getCategory().getGenre());
    }
}

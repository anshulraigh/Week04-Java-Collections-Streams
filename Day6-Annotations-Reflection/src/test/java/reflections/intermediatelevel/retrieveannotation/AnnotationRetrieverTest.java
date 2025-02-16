package reflections.intermediatelevel.retrieveannotation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnnotationRetrieverTest {

    @Test
    void testAuthorAnnotation() {

        Class<Book> bookClass = Book.class;


        assertTrue(bookClass.isAnnotationPresent(Author.class), "Book class should have @Author annotation");


        Author author = bookClass.getAnnotation(Author.class);


        assertEquals("Anshul", author.name(), "Author name should be 'Anshul'");
    }
}

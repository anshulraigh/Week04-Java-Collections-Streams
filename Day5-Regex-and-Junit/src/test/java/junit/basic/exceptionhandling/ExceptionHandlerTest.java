package junit.basic.exceptionhandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlerTest {

    @Test
    public void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            ExceptionHandler.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }

    @Test
    public void testDivideValid() {
        assertEquals(5, ExceptionHandler.divide(10, 2));
    }
}

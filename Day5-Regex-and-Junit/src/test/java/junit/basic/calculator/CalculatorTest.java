package junit.basic.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(7, calc.add(3, 4));
        assertEquals(-1, calc.add(3, -4));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
        assertEquals(15, calc.subtract(10, -5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calc.multiply(4, 5));
        assertEquals(-15, calc.multiply(3, -5));
    }

    @Test
    public void testDivide() {
        assertEquals(4, calc.divide(20, 5));
        assertEquals(-3, calc.divide(15, -5));
    }

    @Test
    public void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}

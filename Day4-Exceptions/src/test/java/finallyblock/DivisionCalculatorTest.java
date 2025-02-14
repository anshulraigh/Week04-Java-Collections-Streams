package finallyblock;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionCalculatorTest {

    @Test
    public void testValidDivision() {
        int result = divide(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        divide(10, 0);
    }

    private int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

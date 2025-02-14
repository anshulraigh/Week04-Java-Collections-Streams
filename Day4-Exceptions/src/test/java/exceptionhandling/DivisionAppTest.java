package exceptionhandling;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionAppTest {

    @Test
    public void testValidDivision() {
        assertEquals(2, DivisionApp.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        DivisionApp.divide(10, 0);
    }
}

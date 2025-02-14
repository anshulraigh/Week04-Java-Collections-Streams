package nestedtrycatch.test;

import nestedtrycatch.NestedTryCatchDemo;
import org.junit.Test;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class NestedTryCatchDemoTest {

    @Test
    public void testValidInput() {
        String input = "3\n10 20 30\n1\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        try {
            NestedTryCatchDemo.main(new String[]{});
        } catch (Exception e) {
            fail("Exception should not have occurred for valid input.");
        }
    }

    @Test
    public void testInvalidIndex() {
        String input = "3\n10 20 30\n5\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        try {
            NestedTryCatchDemo.main(new String[]{});
        } catch (Exception e) {
            assertEquals(ArrayIndexOutOfBoundsException.class, e.getClass());
        }
    }

    @Test
    public void testDivideByZero() {
        String input = "3\n10 20 30\n1\n0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        try {
            NestedTryCatchDemo.main(new String[]{});
        } catch (Exception e) {
            assertEquals(ArithmeticException.class, e.getClass());
        }
    }
}

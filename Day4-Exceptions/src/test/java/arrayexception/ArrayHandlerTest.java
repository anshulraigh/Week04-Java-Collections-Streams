package arrayexception;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayHandlerTest {

    @Test
    public void testValidIndex() {
        Integer[] arr = {10, 20, 30, 40, 50};
        assertEquals(30, ArrayHandler.getValueAtIndex(arr, 2));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInvalidIndex() {
        Integer[] arr = {10, 20, 30, 40, 50};
        ArrayHandler.getValueAtIndex(arr, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testNullArray() {
        Integer[] arr = null;
        ArrayHandler.getValueAtIndex(arr, 0);
    }
}

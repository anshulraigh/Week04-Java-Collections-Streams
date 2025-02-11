package listinterface.listrotation;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListRotatorTest {

    @Test
    void testRotateList() {
        ListRotator listRotator = new ListRotator();
        List<Integer> list = List.of(10, 20, 30, 40, 50);

        List<Integer> result = listRotator.rotateList(list, 2);
        assertEquals(List.of(30, 40, 50, 10, 20), result);
    }

    @Test
    void testNoRotation() {
        ListRotator listRotator = new ListRotator();
        List<Integer> list = List.of(10, 20, 30);

        List<Integer> result = listRotator.rotateList(list, 0);
        assertEquals(list, result);
    }

    @Test
    void testEmptyList() {
        ListRotator listRotator = new ListRotator();
        List<Integer> list = List.of();

        List<Integer> result = listRotator.rotateList(list, 2);
        assertTrue(result.isEmpty());
    }

    @Test
    void testRotationGreaterThanSize() {
        ListRotator listRotator = new ListRotator();
        List<Integer> list = List.of(1, 2, 3);

        List<Integer> result = listRotator.rotateList(list, 5);
        assertEquals(List.of(3, 1, 2), result);
    }
}

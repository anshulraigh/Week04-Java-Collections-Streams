package listinterface.reverselist;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListReverserTest {

    @Test
    void testReverseArrayList() {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ListReverser reverser = new ListReverser();

        reverser.reverseList(list);

        assertEquals(List.of(5, 4, 3, 2, 1), list);
    }

    @Test
    void testReverseLinkedList() {
        List<Integer> list = new LinkedList<>(List.of(10, 20, 30, 40, 50));
        ListReverser reverser = new ListReverser();

        reverser.reverseList(list);

        assertEquals(List.of(50, 40, 30, 20, 10), list);
    }

    @Test
    void testEmptyList() {
        List<Integer> list = new ArrayList<>();
        ListReverser reverser = new ListReverser();

        reverser.reverseList(list);

        assertTrue(list.isEmpty());
    }

    @Test
    void testSingleElementList() {
        List<Integer> list = new ArrayList<>(List.of(42));
        ListReverser reverser = new ListReverser();

        reverser.reverseList(list);

        assertEquals(List.of(42), list);
    }
}

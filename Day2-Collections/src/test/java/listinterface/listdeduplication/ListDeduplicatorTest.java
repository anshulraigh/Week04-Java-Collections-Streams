package listinterface.listdeduplication;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListDeduplicatorTest {

    @Test
    void testRemoveDuplicates() {
        ListDeduplicator listDeduplicator = new ListDeduplicator();
        List<Integer> list = List.of(3, 1, 2, 2, 3, 4);

        List<Integer> result = listDeduplicator.removeDuplicates(list);
        assertEquals(List.of(3, 1, 2, 4), result);
    }

    @Test
    void testNoDuplicates() {
        ListDeduplicator listDeduplicator = new ListDeduplicator();
        List<Integer> list = List.of(1, 2, 3, 4);

        List<Integer> result = listDeduplicator.removeDuplicates(list);
        assertEquals(list, result);
    }

    @Test
    void testEmptyList() {
        ListDeduplicator listDeduplicator = new ListDeduplicator();
        List<Integer> list = List.of();

        List<Integer> result = listDeduplicator.removeDuplicates(list);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleElementList() {
        ListDeduplicator listDeduplicator = new ListDeduplicator();
        List<Integer> list = List.of(1);

        List<Integer> result = listDeduplicator.removeDuplicates(list);
        assertEquals(list, result);
    }
}

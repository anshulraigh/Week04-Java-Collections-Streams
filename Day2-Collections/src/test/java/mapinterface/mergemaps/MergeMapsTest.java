package mapinterface.mergemaps;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MergeMapsTest {
    @Test
    void testMergeMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A", 1);
        expected.put("B", 5);
        expected.put("C", 4);

        assertEquals(expected, MergeMaps.merge(map1, map2));
    }

    @Test
    void testMergeWithEmptyMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("X", 5);
        map1.put("Y", 10);

        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(map1, MergeMaps.merge(map1, map2));
    }

    @Test
    void testMergeBothEmpty() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(MergeMaps.merge(map1, map2).isEmpty());
    }
}

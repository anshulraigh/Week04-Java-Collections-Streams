package mapinterface.invertmap;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {
    @Test
    void testInvertMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> result = InvertMap.invert(inputMap);

        assertEquals(2, result.get(1).size());
        assertTrue(result.get(1).contains("A"));
        assertTrue(result.get(1).contains("C"));
        assertEquals(1, result.get(2).size());
        assertTrue(result.get(2).contains("B"));
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        Map<Integer, List<String>> result = InvertMap.invert(inputMap);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleElementMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("X", 5);

        Map<Integer, List<String>> result = InvertMap.invert(inputMap);

        assertEquals(1, result.size());
        assertEquals(1, result.get(5).size());
        assertTrue(result.get(5).contains("X"));
    }
}

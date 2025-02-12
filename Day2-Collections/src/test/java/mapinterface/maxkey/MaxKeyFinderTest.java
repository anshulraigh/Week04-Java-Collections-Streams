package mapinterface.maxkey;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MaxKeyFinderTest {
    @Test
    void testFindMaxKey() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        assertEquals("B", MaxKeyFinder.findMaxKey(inputMap));
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        assertNull(MaxKeyFinder.findMaxKey(inputMap));
    }

    @Test
    void testSingleElementMap() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("X", 100);
        assertEquals("X", MaxKeyFinder.findMaxKey(inputMap));
    }

    @Test
    void testMultipleMaxValues() {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 20);
        inputMap.put("B", 20);
        inputMap.put("C", 10);

        String result = MaxKeyFinder.findMaxKey(inputMap);
        assertTrue(result.equals("A") || result.equals("B")); // Any one is valid
    }
}

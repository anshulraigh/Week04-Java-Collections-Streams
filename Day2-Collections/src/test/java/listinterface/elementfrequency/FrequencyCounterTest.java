package listinterface.elementfrequency;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyCounterTest {

    @Test
    void testCountFrequency() {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        List<String> list = List.of("apple", "banana", "apple", "orange");

        Map<String, Integer> result = frequencyCounter.countFrequency(list);

        assertEquals(2, result.get("apple"));
        assertEquals(1, result.get("banana"));
        assertEquals(1, result.get("orange"));
    }

    @Test
    void testEmptyList() {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        List<String> list = List.of();

        Map<String, Integer> result = frequencyCounter.countFrequency(list);

        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleElementList() {
        FrequencyCounter frequencyCounter = new FrequencyCounter();
        List<String> list = List.of("apple");

        Map<String, Integer> result = frequencyCounter.countFrequency(list);

        assertEquals(1, result.get("apple"));
    }
}


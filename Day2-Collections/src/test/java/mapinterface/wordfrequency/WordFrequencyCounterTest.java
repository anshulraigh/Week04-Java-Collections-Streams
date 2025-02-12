package mapinterface.wordfrequency;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {
    @Test
    void testWordFrequency() {
        String text = "Hello world, hello Java!";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);

        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("java"));
    }

    @Test
    void testEmptyString() {
        String text = "";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);
        assertTrue(result.isEmpty());
    }

    @Test
    void testCaseInsensitivity() {
        String text = "HELLO hello HeLLo";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);
        assertEquals(3, result.get("hello"));
    }

    @Test
    void testPunctuationIgnored() {
        String text = "Hello! Hello, hello.";
        Map<String, Integer> result = WordFrequencyCounter.countWords(text);
        assertEquals(3, result.get("hello"));
    }
}

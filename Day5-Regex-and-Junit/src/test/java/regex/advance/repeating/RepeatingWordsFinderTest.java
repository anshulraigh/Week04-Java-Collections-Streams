package regex.advance.repeating;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatingWordsFinderTest {

    @Test
    public void testFindRepeatingWords() {
        String text = "This is is a repeated repeated word test.";
        String[] expected = {"is", "repeated"};
        String[] actual = RepeatingWordsFinder.getRepeatingWords(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoRepeatingWords() {
        String text = "This sentence has no repeated words.";
        String[] expected = {};
        String[] actual = RepeatingWordsFinder.getRepeatingWords(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMultipleRepetitions() {
        // Even if a word is repeated more than once, it should appear only once in the result.
        String text = "hello hello hello world world";
        String[] expected = {"hello", "world"};
        String[] actual = RepeatingWordsFinder.getRepeatingWords(text);
        assertArrayEquals(expected, actual);
    }
}

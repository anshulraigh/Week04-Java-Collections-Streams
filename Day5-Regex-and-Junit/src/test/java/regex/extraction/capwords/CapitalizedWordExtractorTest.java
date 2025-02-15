package regex.extraction.capwords;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizedWordExtractorTest {

    @Test
    public void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String[] expected = {"Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York"};
        String[] actual = CapitalizedWordExtractor.extractCapitalizedWords(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoCapitalizedWords() {
        String text = "all words are lowercase here.";
        String[] expected = {};
        String[] actual = CapitalizedWordExtractor.extractCapitalizedWords(text);
        assertArrayEquals(expected, actual);
    }
}

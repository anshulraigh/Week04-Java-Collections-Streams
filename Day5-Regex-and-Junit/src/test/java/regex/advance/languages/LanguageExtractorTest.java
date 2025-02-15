package regex.advance.languages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LanguageExtractorTest {

    @Test
    public void testExtractLanguageNames() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] expected = {"Java", "Python", "JavaScript", "Go"};
        String[] actual = LanguageExtractor.getLanguageNames(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoLanguageNames() {
        String text = "i love coding but not in any specific language.";
        String[] expected = {};
        String[] actual = LanguageExtractor.getLanguageNames(text);
        assertArrayEquals(expected, actual);
    }
}

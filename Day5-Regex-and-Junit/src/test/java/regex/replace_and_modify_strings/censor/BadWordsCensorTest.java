package regex.replace_and_modify_strings.censor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BadWordsCensorTest {

    @Test
    public void testCensorBadWords() {
        String input = "This is a damn bad example with some stupid words.";
        String expected = "This is a **** bad example with some **** words.";
        String actual = BadWordsCensor.censorBadWords(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCensorWithMixedCase() {
        String input = "Damn, that was STUPID!";
        String expected = "****, that was ****!";
        String actual = BadWordsCensor.censorBadWords(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoBadWords() {
        String input = "This is a clean sentence.";
        String expected = "This is a clean sentence.";
        String actual = BadWordsCensor.censorBadWords(input);
        assertEquals(expected, actual);
    }
}

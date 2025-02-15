package regex.replace_and_modify_strings.spacereplacer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpaceReplacerTest {

    @Test
    public void testReplaceMultipleSpaces() {
        String input = "This    is   an    example   with   multiple   spaces.";
        String expected = "This is an example with multiple spaces.";
        String actual = SpaceReplacer.replaceMultipleSpaces(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoExtraSpaces() {
        String input = "This is an example with single spaces.";
        String expected = "This is an example with single spaces.";
        String actual = SpaceReplacer.replaceMultipleSpaces(input);
        assertEquals(expected, actual);
    }
}

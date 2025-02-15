package regex.basic.hexcolor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexColorValidatorTest {

    @Test
    public void testValidHexColorUpperCase() {
        assertTrue(HexColorValidator.isValid("#FFA500"));
    }

    @Test
    public void testValidHexColorLowerCase() {
        assertTrue(HexColorValidator.isValid("#ff4500"));
    }

    @Test
    public void testInvalidHexColorTooShort() {
        assertFalse(HexColorValidator.isValid("#123"));
    }

    @Test
    public void testInvalidHexColorInvalidCharacter() {
        // Contains an invalid character 'G'
        assertFalse(HexColorValidator.isValid("#ffG450"));
    }
}

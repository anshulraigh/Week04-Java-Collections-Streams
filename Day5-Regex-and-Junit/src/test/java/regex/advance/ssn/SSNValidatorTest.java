package regex.advance.ssn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SSNValidatorTest {

    @Test
    public void testValidSSN() {
        String validSSN = "123-45-6789";
        assertTrue(SSNValidator.isValidSSN(validSSN));
    }

    @Test
    public void testInvalidSSN_MissingHyphens() {
        String invalidSSN = "123456789";
        assertFalse(SSNValidator.isValidSSN(invalidSSN));
    }

    @Test
    public void testInvalidSSN_WrongFormat() {
        String invalidSSN = "12-345-6789";
        assertFalse(SSNValidator.isValidSSN(invalidSSN));
    }
}

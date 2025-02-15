package junit.advance.password;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    @Test
    public void testValidPasswords() {
        // Should be valid: at least 8 characters, one uppercase letter, and one digit.
        assertTrue(PasswordValidator.isValid("Password1"));
        assertTrue(PasswordValidator.isValid("HELLO1234"));
        assertTrue(PasswordValidator.isValid("Abcdefg8"));
    }

    @Test
    public void testInvalidPasswords() {
        // Less than 8 characters
        assertFalse(PasswordValidator.isValid("Pass1"));
        // No uppercase letter
        assertFalse(PasswordValidator.isValid("password1"));
        // No digit
        assertFalse(PasswordValidator.isValid("Password"));
        // Null password
        assertFalse(PasswordValidator.isValid(null));
    }
}

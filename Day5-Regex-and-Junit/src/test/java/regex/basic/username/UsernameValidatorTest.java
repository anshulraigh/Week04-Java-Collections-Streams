package regex.basic.username;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsernameValidatorTest {

    @Test
    public void testValidUsername() {
        assertTrue(UsernameValidator.isValid("user_123"));
    }

    @Test
    public void testInvalidUsernameStartsWithNumber() {
        assertFalse(UsernameValidator.isValid("123user"));
    }

    @Test
    public void testInvalidUsernameTooShort() {
        assertFalse(UsernameValidator.isValid("us"));
    }

    @Test
    public void testInvalidUsernameSpecialChars() {
        // Contains an invalid character: !
        assertFalse(UsernameValidator.isValid("user!name"));
    }
}

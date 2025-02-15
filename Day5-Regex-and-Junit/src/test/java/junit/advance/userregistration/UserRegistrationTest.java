package junit.advance.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    @Test
    public void testValidRegistration() {
        String result = UserRegistration.registerUser("johnDoe", "john.doe@example.com", "password123");
        assertEquals("User registered successfully.", result);
    }

    @Test
    public void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "john.doe@example.com", "password123");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    @Test
    public void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("johnDoe", "john.doeexample.com", "password123");
        });
        assertEquals("Invalid email address.", exception.getMessage());
    }

    @Test
    public void testShortPassword() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("johnDoe", "john.doe@example.com", "pass");
        });
        assertEquals("Password must be at least 8 characters long.", exception.getMessage());
    }
}

package customexception;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgeValidatorTest {

    @Test
    public void testValidAge() {
        try {
            AgeValidator.validateAge(20);
        } catch (InvalidAgeException e) {
            fail("Exception should not be thrown for age 20");
        }
    }

    @Test
    public void testInvalidAge() {
        try {
            AgeValidator.validateAge(16);
            fail("Expected InvalidAgeException to be thrown");
        } catch (InvalidAgeException e) {
            assertEquals("Age must be 18 or above", e.getMessage());
        }
    }
}

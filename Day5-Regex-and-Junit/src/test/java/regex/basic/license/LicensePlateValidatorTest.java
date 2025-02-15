package regex.basic.license;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LicensePlateValidatorTest {

    @Test
    public void testValidLicensePlate() {
        assertTrue(LicensePlateValidator.isValid("AB1234"));
    }

    @Test
    public void testInvalidLicensePlateWrongFormat() {
        // Invalid because it does not start with two uppercase letters
        assertFalse(LicensePlateValidator.isValid("A12345"));
    }

    @Test
    public void testInvalidLicensePlateLowercase() {
        // Invalid because letters must be uppercase
        assertFalse(LicensePlateValidator.isValid("ab1234"));
    }
}

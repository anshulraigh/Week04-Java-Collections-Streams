package regex.advance.creditcard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {

    @Test
    public void testValidVisaCard() {
        // Visa card number: starts with 4 and has 16 digits.
        String visa = "4123456789012345";
        assertTrue(CreditCardValidator.isValidCreditCard(visa));
    }

    @Test
    public void testValidMasterCard() {
        // MasterCard number: starts with 5 and has 16 digits.
        String masterCard = "5123456789012345";
        assertTrue(CreditCardValidator.isValidCreditCard(masterCard));
    }

    @Test
    public void testInvalidCardNumber_WrongLength() {
        // Too short (15 digits)
        String invalidCard = "412345678901234";
        assertFalse(CreditCardValidator.isValidCreditCard(invalidCard));
    }

    @Test
    public void testInvalidCardNumber_WrongStartingDigit() {
        // Invalid starting digit (e.g., 3)
        String invalidCard = "3123456789012345";
        assertFalse(CreditCardValidator.isValidCreditCard(invalidCard));
    }
}

package junit.advance.dateformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    @Test
    public void testValidDateConversion() {
        String input = "2023-08-14";
        String expected = "14-08-2023";
        assertEquals(expected, DateFormatter.formatDate(input));
    }

    @Test
    public void testValidDateConversionLeapYear() {
        String input = "2020-02-29";
        String expected = "29-02-2020";
        assertEquals(expected, DateFormatter.formatDate(input));
    }

    @Test
    public void testInvalidDateFormat() {
        String invalidInput = "14-08-2023"; // Wrong format
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate(invalidInput);
        });
        assertEquals("Invalid date format", exception.getMessage());
    }

    @Test
    public void testInvalidDateValue() {
        String invalidInput = "2023-02-30"; // Invalid date
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate(invalidInput);
        });
        assertEquals("Invalid date format", exception.getMessage());
    }
}

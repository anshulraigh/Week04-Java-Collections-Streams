package regex.extraction.email;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailExtractorTest {

    @Test
    public void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        String[] expected = {"support@example.com", "info@company.org"};
        String[] actual = EmailExtractor.getEmails(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoEmailsFound() {
        String text = "This text contains no email addresses.";
        String[] expected = {};
        String[] actual = EmailExtractor.getEmails(text);
        assertArrayEquals(expected, actual);
    }
}

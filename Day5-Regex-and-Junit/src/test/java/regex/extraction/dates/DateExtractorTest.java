package regex.extraction.dates;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateExtractorTest {

    @Test
    public void testExtractDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        String[] expected = {"12/05/2023", "15/08/2024", "29/02/2020"};
        String[] actual = DateExtractor.getDates(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoDatesFound() {
        String text = "There are no dates in this text.";
        String[] expected = {};
        String[] actual = DateExtractor.getDates(text);
        assertArrayEquals(expected, actual);
    }
}

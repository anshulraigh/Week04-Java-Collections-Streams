package regex.advance.currency;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyExtractorTest {

    @Test
    public void testExtractCurrencyValues() {
        String text = "The price is $45.99, and the discount is 10.50.";
        String[] expected = {"$45.99", "10.50"};
        String[] actual = CurrencyExtractor.getCurrencyValues(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoCurrencyValuesFound() {
        String text = "There are no currency values here.";
        String[] expected = {};
        String[] actual = CurrencyExtractor.getCurrencyValues(text);
        assertArrayEquals(expected, actual);
    }
}

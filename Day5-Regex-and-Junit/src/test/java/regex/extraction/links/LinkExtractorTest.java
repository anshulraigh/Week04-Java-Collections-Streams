package regex.extraction.links;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkExtractorTest {

    @Test
    public void testExtractLinks() {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String[] expected = {"https://www.google.com", "http://example.org"};
        String[] actual = LinkExtractor.getLinks(text);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoLinksFound() {
        String text = "There are no links here.";
        String[] expected = {};
        String[] actual = LinkExtractor.getLinks(text);
        assertArrayEquals(expected, actual);
    }
}

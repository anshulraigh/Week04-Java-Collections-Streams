package wordcounter;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WordCounterTest {
    @Test
    public void testCountWords() throws IOException {
        File tempFile = File.createTempFile("testfile", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Hello world! Hello everyone.\n");
            writer.write("This is a test file. Test this program.");
        }

        WordCounter counter = new WordCounter();
        Map<String, Integer> wordCounts = counter.countWords(tempFile);

        assertEquals(2, wordCounts.get("hello"));
        assertEquals(2, wordCounts.get("test"));
        assertEquals(1, wordCounts.get("everyone"));
    }
}

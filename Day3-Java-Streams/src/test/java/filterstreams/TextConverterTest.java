package filterstreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

public class TextConverterTest {
    private static final String TEST_INPUT_FILE = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_input.txt";
    private static final String TEST_OUTPUT_FILE = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_output.txt";

    @Test
    public void testConvertUppercaseToLowercase() throws IOException {
        Files.writeString(Paths.get(TEST_INPUT_FILE), "HELLO WORLD!");
        TextConverter.convertUppercaseToLowercase(TEST_INPUT_FILE, TEST_OUTPUT_FILE);

        String result = Files.readString(Paths.get(TEST_OUTPUT_FILE));
        assertEquals("hello world!", result, "Converted text should be in lowercase.");
    }

    @Test
    public void testFileExistsAfterConversion() throws IOException {
        Files.writeString(Paths.get(TEST_INPUT_FILE), "TEST CONTENT");
        TextConverter.convertUppercaseToLowercase(TEST_INPUT_FILE, TEST_OUTPUT_FILE);

        File outputFile = new File(TEST_OUTPUT_FILE);
        assertTrue(outputFile.exists(), "Converted file should exist.");
    }
}

package junit.basic.filehandling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class FileProcessorTest {

    private static final String TEST_FILENAME = "testfile.txt";
    private static final String TEST_CONTENT = "Hello, this is a test.";

    @Test
    public void testWriteAndRead() throws IOException {
        // Write content to file
        FileProcessor.writeToFile(TEST_FILENAME, TEST_CONTENT);

        // Verify that the file exists after writing
        File file = new File(TEST_FILENAME);
        assertTrue(file.exists(), "File should exist after writing.");

        // Read content from the file and verify correctness
        String content = FileProcessor.readFromFile(TEST_FILENAME);
        assertEquals(TEST_CONTENT, content);

        // Clean up: delete the test file
        file.delete();
    }

    @Test
    public void testReadFromNonExistentFile() {
        String nonExistentFilename = "nonexistent.txt";
        // Expect an IOException when attempting to read a non-existent file
        assertThrows(IOException.class, () -> {
            FileProcessor.readFromFile(nonExistentFilename);
        });
    }
}

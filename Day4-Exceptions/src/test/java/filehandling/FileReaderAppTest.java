package filehandling;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileReaderAppTest {

    @Test
    public void testFileNotFound() {
        try {
            FileReaderApp.readFile("non_existing_file.txt");
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            assertEquals("File not found", "File not found");
        }
    }
}

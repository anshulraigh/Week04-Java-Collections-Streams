package largefilereader;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LargeFileProcessorTest {
    @Test
    public void testProcessFile() throws IOException {
        File tempFile = File.createTempFile("testfile", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("This is a test line.\n");
            writer.write("Something went wrong: ERROR detected.\n");
            writer.write("Another normal line.\n");
            writer.write("Warning: potential error here.\n");
        }

        LargeFileProcessor processor = new LargeFileProcessor();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        processor.processFile(tempFile);

        System.setOut(originalOut);
        String output = outputStream.toString().toLowerCase();
        assertTrue(output.contains("error"), "Output should contain lines with 'error'");
    }
}

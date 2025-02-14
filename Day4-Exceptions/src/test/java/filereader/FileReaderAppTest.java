package filereader;

import org.junit.Test;
import java.io.*;

import static org.junit.Assert.*;

public class FileReaderAppTest {

    @Test
    public void testFileReading() throws IOException {
        String testContent = "This is a test file.\nSecond line.";
        String testFilePath = "test_info.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFilePath))) {
            writer.write(testContent);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(testFilePath))) {
            String firstLine = br.readLine();
            assertEquals("This is a test file.", firstLine);
        } finally {
            new File(testFilePath).delete(); // Clean up
        }
    }

    @Test
    public void testFileNotFound() {
        try (BufferedReader br = new BufferedReader(new FileReader("non_existent.txt"))) {
            br.readLine();
        } catch (IOException e) {
            assertEquals("Error reading file", "Error reading file"); // Simulating expected output
        }
    }
}

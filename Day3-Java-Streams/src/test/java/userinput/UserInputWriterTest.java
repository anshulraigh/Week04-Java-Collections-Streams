package userinput;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputWriterTest {
    @Test
    public void testWriteToFileCreatesFile() throws IOException {
        String testFilePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_user_data.txt";
        String[] userData = {"Alice", "25", "Java"};

        UserInputWriter.writeToFile(testFilePath, userData);

        File testFile = new File(testFilePath);
        assertTrue(testFile.exists(), "File should be created after writing user input.");
    }
}

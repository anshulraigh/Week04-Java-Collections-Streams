package userinput;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserInputHandlerTest {
    @Test
    public void testHandleUserInputCreatesFile() throws Exception {
        UserInputHandler.handleUserInput();
        File testFile = new File("C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\user_data.txt");
        assertTrue(testFile.exists(), "User data file should be created after handling input.");
    }
}

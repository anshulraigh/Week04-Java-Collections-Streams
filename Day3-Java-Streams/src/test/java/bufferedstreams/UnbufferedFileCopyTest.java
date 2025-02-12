package bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnbufferedFileCopyTest {
    @Test
    public void testUnbufferedCopyCreatesFile() throws IOException {
        String sourcePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\source.txt";
        String destPath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_unbuffered_dest.txt";

        UnbufferedFileCopy.copy(sourcePath, destPath);

        File destFile = new File(destPath);
        assertTrue(destFile.exists(), "Unbuffered copy should create the destination file.");
    }
}

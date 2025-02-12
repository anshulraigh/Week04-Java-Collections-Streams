package bytearraystream;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;

public class ImageConverterTest {
    private static final String TEST_SOURCE_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_image.jpg";
    private static final String TEST_DEST_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_copied.jpg";

    @Test
    public void testImageToByteArray() throws IOException {
        byte[] imageBytes = ImageConverter.imageToByteArray(TEST_SOURCE_PATH);
        assertNotNull(imageBytes, "Byte array should not be null.");
        assertTrue(imageBytes.length > 0, "Byte array should not be empty.");
    }

    @Test
    public void testByteArrayToImage() throws IOException {
        byte[] imageBytes = ImageConverter.imageToByteArray(TEST_SOURCE_PATH);
        ImageConverter.byteArrayToImage(imageBytes, TEST_DEST_PATH);

        File copiedFile = new File(TEST_DEST_PATH);
        assertTrue(copiedFile.exists(), "Copied image file should exist.");
        assertEquals(Files.size(Paths.get(TEST_SOURCE_PATH)), Files.size(Paths.get(TEST_DEST_PATH)), "File sizes should match.");
    }
}

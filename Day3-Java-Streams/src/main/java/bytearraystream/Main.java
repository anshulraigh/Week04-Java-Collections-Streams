package bytearraystream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final String SOURCE_IMAGE_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\source.jpg";
    private static final String DEST_IMAGE_PATH = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\copied.jpg";

    public static void main(String[] args) {
        try {
            byte[] imageBytes = ImageConverter.imageToByteArray(SOURCE_IMAGE_PATH);
            System.out.println("Image successfully converted to byte array!");

            ImageConverter.byteArrayToImage(imageBytes, DEST_IMAGE_PATH);
            System.out.println("Byte array successfully written back to image file!");

            if (Files.exists(Paths.get(DEST_IMAGE_PATH))) {
                System.out.println("Image file copied successfully!");
            } else {
                System.out.println("Failed to copy the image.");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

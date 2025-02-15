package junit.basic.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {

    /**
     * Writes the given content to a file with the specified filename.
     * @param filename the name of the file
     * @param content the content to write
     * @throws IOException if an I/O error occurs
     */
    public static void writeToFile(String filename, String content) throws IOException {
        Files.write(Path.of(filename), content.getBytes());
    }

    /**
     * Reads the content from the file with the specified filename.
     * @param filename the name of the file
     * @return the content of the file as a String
     * @throws IOException if the file does not exist or an I/O error occurs
     */
    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }
}

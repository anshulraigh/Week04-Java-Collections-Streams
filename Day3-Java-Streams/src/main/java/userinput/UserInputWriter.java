package userinput;

import java.io.FileWriter;
import java.io.IOException;

public class UserInputWriter {
    public static void writeToFile(String filePath, String[] userData) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Name: " + userData[0] + "\n");
            writer.write("Age: " + userData[1] + "\n");
            writer.write("Favorite Language: " + userData[2] + "\n");
        }
    }
}

package filterstreams;

import java.io.*;

public class TextConverter {
    public static void convertUppercaseToLowercase(String inputFile, String outputFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(Character.toLowerCase(character));
            }
        }
    }
}

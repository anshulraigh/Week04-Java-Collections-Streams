package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp {
    public static void main(String[] args) {
        String filePath = "info.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

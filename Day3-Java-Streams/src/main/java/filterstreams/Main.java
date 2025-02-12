package filterstreams;

import java.io.IOException;

public class Main {
    private static final String SOURCE_FILE = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\source.txt";
    private static final String DEST_FILE = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\converted.txt";

    public static void main(String[] args) {
        try {
            TextConverter.convertUppercaseToLowercase(SOURCE_FILE, DEST_FILE);
            System.out.println("File conversion completed successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

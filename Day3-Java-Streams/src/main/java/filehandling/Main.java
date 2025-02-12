package filehandling;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();

        String sourceFilePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\src.txt";
        String destinationFilePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\dest.txt";

        fileHandler.copyFile(sourceFilePath, destinationFilePath);
    }
}

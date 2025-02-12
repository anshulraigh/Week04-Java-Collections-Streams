package largefilereader;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Public\\largefile.txt"; // Provide actual file path
        File file = new File(filePath);

        LargeFileProcessor processor = new LargeFileProcessor();
        processor.processFile(file);
    }
}

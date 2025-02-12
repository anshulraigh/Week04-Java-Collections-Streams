package bufferedstreams;

import java.io.*;

public class UnbufferedFileCopy {
    public static void copy(String sourcePath, String destPath) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
        }
    }
}

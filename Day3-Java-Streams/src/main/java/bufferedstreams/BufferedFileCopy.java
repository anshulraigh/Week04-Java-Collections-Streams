package bufferedstreams;

import java.io.*;

public class BufferedFileCopy {
    public static void copy(String sourcePath, String destPath) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {

            byte[] buffer = new byte[4096]; // 4 KB chunks
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }
}

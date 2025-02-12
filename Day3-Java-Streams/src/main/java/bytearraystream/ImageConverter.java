package bytearraystream;

import java.io.*;

public class ImageConverter {
    public static byte[] imageToByteArray(String filePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(filePath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    public static void byteArrayToImage(byte[] imageBytes, String outputFilePath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}

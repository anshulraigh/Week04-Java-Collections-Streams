package bufferedstreams;

import java.io.IOException;

public class PerformanceComparison {
    public static long copyWithBufferedStream(String sourcePath, String destPath) throws IOException {
        long startTime = System.nanoTime();
        BufferedFileCopy.copy(sourcePath, destPath);
        return System.nanoTime() - startTime;
    }

    public static long copyWithUnbufferedStream(String sourcePath, String destPath) throws IOException {
        long startTime = System.nanoTime();
        UnbufferedFileCopy.copy(sourcePath, destPath);
        return System.nanoTime() - startTime;
    }
}

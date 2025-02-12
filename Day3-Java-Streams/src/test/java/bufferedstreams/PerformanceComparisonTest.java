package bufferedstreams;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerformanceComparisonTest {
    @Test
    public void testBufferedFasterThanUnbuffered() throws IOException {
        String sourcePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\source.txt";
        String bufferedDestPath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_buffered_dest.txt";
        String unbufferedDestPath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\test_unbuffered_dest.txt";

        long bufferedTime = PerformanceComparison.copyWithBufferedStream(sourcePath, bufferedDestPath);
        long unbufferedTime = PerformanceComparison.copyWithUnbufferedStream(sourcePath, unbufferedDestPath);

        assertTrue(bufferedTime < unbufferedTime, "Buffered copy should be faster than unbuffered copy.");
    }
}

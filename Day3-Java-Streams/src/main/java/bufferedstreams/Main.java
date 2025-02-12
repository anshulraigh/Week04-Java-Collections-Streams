package bufferedstreams;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourcePath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\source.txt";
        String bufferedDestPath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\buffered_dest.txt";
        String unbufferedDestPath = "C:\\Users\\Public\\CapgeminiHandsOn\\Week04\\Day3-Java-Streams\\src\\main\\java\\unbuffered_dest.txt";

        try {
            System.out.println("Copying using Buffered Streams...");
            long bufferedTime = PerformanceComparison.copyWithBufferedStream(sourcePath, bufferedDestPath);
            System.out.println("Time taken with Buffered Streams: " + bufferedTime + " ns");

            System.out.println("\nCopying using Normal Streams...");
            long unbufferedTime = PerformanceComparison.copyWithUnbufferedStream(sourcePath, unbufferedDestPath);
            System.out.println("Time taken with Unbuffered Streams: " + unbufferedTime + " ns");

            System.out.println("\nPerformance Improvement: " + (unbufferedTime / (double) bufferedTime) + "x faster with Buffered Streams.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

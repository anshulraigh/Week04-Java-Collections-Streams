package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {
    public static void main(String[] args) {
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream();

        try {
            // Connecting input and output streams
            inputStream.connect(outputStream);

            // Creating writer and reader threads
            Thread writerThread = new Thread(new PipedWriterThread(outputStream));
            Thread readerThread = new Thread(new PipedReaderThread(inputStream));

            // Starting threads
            writerThread.start();
            readerThread.start();

            // Ensuring both threads complete execution
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

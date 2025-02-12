package pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedWriterThread implements Runnable {
    private final PipedOutputStream outputStream;

    public PipedWriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            outputStream.write(message.getBytes());
            outputStream.flush();
            System.out.println("Writer Thread: Data written successfully!");
        } catch (IOException e) {
            System.err.println("Writer Thread Error: " + e.getMessage());
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                System.err.println("Error closing output stream: " + e.getMessage());
            }
        }
    }
}

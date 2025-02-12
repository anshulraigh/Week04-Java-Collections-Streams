package pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class PipedReaderThread implements Runnable {
    private final PipedInputStream inputStream;

    public PipedReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        byte[] buffer = new byte[1024];
        try {
            int bytesRead = inputStream.read(buffer);
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reader Thread: Received - " + receivedMessage);
        } catch (IOException e) {
            System.err.println("Reader Thread Error: " + e.getMessage());
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                System.err.println("Error closing input stream: " + e.getMessage());
            }
        }
    }
}

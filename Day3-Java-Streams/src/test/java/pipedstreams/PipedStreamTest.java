package pipedstreams;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PipedStreamTest {
    @Test
    public void testPipedStreamCommunication() throws IOException, InterruptedException {
        PipedOutputStream outputStream = new PipedOutputStream();
        PipedInputStream inputStream = new PipedInputStream();

        inputStream.connect(outputStream);

        Thread writerThread = new Thread(new PipedWriterThread(outputStream));
        Thread readerThread = new Thread(() -> {
            byte[] buffer = new byte[1024];
            try {
                int bytesRead = inputStream.read(buffer);
                String receivedMessage = new String(buffer, 0, bytesRead);
                assertEquals("Hello from Writer Thread!", receivedMessage, "Received message should match the sent message.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        writerThread.start();
        readerThread.start();

        writerThread.join();
        readerThread.join();
    }
}

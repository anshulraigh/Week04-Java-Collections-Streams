package queueinterface.circularbuffer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {
    @Test
    void testCircularBufferOperations() {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        assertEquals(1, buffer.dequeue());
        buffer.enqueue(4);
        assertEquals(2, buffer.dequeue());
        assertEquals(3, buffer.dequeue());
        assertEquals(4, buffer.dequeue());

        assertTrue(buffer.isEmpty());

        buffer.enqueue(5);
        assertEquals(5, buffer.peek());
        assertFalse(buffer.isEmpty());
    }

    @Test
    void testBufferOverwrite() {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.enqueue(4); // Overwrites 1
        assertEquals(2, buffer.dequeue()); // 2 should be the first now
    }
}

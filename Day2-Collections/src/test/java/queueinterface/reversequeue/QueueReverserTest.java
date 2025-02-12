package queueinterface.reversequeue;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class QueueReverserTest {

    @Test
    void testReverseQueue() {
        QueueReverser reverser = new QueueReverser();
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(30, 20, 10));

        assertEquals(expected, reverser.reverse(queue));
    }

    @Test
    void testReverseEmptyQueue() {
        QueueReverser reverser = new QueueReverser();
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> expected = new LinkedList<>();

        assertEquals(expected, reverser.reverse(queue));
    }

    @Test
    void testReverseSingleElementQueue() {
        QueueReverser reverser = new QueueReverser();
        Queue<Integer> queue = new LinkedList<>(Collections.singletonList(42));
        Queue<Integer> expected = new LinkedList<>(Collections.singletonList(42));

        assertEquals(expected, reverser.reverse(queue));
    }
}

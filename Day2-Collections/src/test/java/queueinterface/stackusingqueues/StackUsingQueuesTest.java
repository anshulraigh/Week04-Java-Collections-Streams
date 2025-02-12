package queueinterface.stackusingqueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {

    @Test
    void testPushAndTop() {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.top());
    }

    @Test
    void testPop() {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void testIsEmpty() {
        StackUsingQueues stack = new StackUsingQueues();
        assertTrue(stack.isEmpty());
        stack.push(10);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopOnEmptyStack() {
        StackUsingQueues stack = new StackUsingQueues();
        assertThrows(IllegalStateException.class, stack::pop);
    }
}

package queueinterface.stackusingqueues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackUsingQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    public int top() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }
        int topElement = queue1.peek();
        queue2.add(queue1.poll());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return topElement;
    }

    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}

package queueinterface.reversequeue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        QueueReverser reverser = new QueueReverser();
        Queue<Integer> reversedQueue = reverser.reverse(queue);

        System.out.println("Reversed Queue: " + reversedQueue);
    }
}

package queueinterface.circularbuffer;

public class Main {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        buffer.display(); // Output: Buffer: 1 2 3

        buffer.enqueue(4);
        buffer.display(); // Output: Buffer: 2 3 4 (1 is overwritten)

        System.out.println("Dequeued: " + buffer.dequeue()); // Output: Dequeued: 2
        buffer.display(); // Output: Buffer: 3 4

        buffer.enqueue(5);
        buffer.display(); // Output: Buffer: 3 4 5
    }
}

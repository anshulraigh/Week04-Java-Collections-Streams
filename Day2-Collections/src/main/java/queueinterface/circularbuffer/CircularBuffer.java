package queueinterface.circularbuffer;

class CircularBuffer {
    private int[] buffer;
    private int front, rear, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) {
        rear = (rear + 1) % capacity;
        buffer[rear] = data;
        if (size < capacity) {
            size++;
        } else {
            front = (front + 1) % capacity; // Overwrite oldest element
        }
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty");
        }
        int data = buffer[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException("Buffer is empty");
        }
        return buffer[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        System.out.print("Buffer: ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

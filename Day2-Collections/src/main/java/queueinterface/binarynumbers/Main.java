package queueinterface.binarynumbers;

public class Main {
    public static void main(String[] args) {
        int N = 5;
        BinaryNumberGenerator generator = new BinaryNumberGenerator();
        System.out.println("First " + N + " Binary Numbers: " + generator.generateBinaryNumbers(N));
    }
}

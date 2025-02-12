package queueinterface.binarynumbers;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryNumberGenerator {
    public List<String> generateBinaryNumbers(int N) {
        List<String> result = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }
}

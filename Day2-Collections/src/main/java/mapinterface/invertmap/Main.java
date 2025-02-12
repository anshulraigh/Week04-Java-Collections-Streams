package mapinterface.invertmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = InvertMap.invert(inputMap);

        System.out.println("Inverted Map: " + invertedMap);
        // Expected Output: {1=[A, C], 2=[B]}
    }
}

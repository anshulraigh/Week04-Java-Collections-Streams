package mapinterface.mergemaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = MergeMaps.merge(map1, map2);

        System.out.println("Merged Map: " + mergedMap);
        // Expected Output: {A=1, B=5, C=4}
    }
}

package mapinterface.invertmap;

import java.util.*;

class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            invertedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        return invertedMap;
    }
}

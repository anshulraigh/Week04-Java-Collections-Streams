package mapinterface.maxkey;

import java.util.Map;

class MaxKeyFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}

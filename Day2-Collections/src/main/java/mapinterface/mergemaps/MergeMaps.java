package mapinterface.mergemaps;

import java.util.HashMap;
import java.util.Map;

class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return result;
    }
}

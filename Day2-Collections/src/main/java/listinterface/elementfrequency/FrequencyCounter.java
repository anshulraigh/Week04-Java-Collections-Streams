package listinterface.elementfrequency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}

package listinterface.elementfrequency;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = List.of("apple", "banana", "apple", "orange");

        FrequencyCounter frequencyCounter = new FrequencyCounter();
        Map<String, Integer> frequencyMap = frequencyCounter.countFrequency(inputList);

        System.out.println("Frequency Map: " + frequencyMap);
    }
}


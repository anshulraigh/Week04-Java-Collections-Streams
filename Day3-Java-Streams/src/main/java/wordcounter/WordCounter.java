package wordcounter;

import java.io.*;
import java.util.*;

public class WordCounter {
    public Map<String, Integer> countWords(File file) {
        Map<String, Integer> wordMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordMap;
    }

    public void displayTopWords(Map<String, Integer> wordMap, int topN) {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordMap.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Top " + topN + " most frequent words:");
        for (int i = 0; i < Math.min(topN, sortedList.size()); i++) {
            System.out.println(sortedList.get(i).getKey() + " - " + sortedList.get(i).getValue());
        }
    }
}

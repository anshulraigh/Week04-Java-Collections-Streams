package mapinterface.wordfrequency;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";

        Map<String, Integer> wordCount = WordFrequencyCounter.countWords(text);

        System.out.println("Word Frequency: " + wordCount);
        // Expected Output: {hello=2, world=1, java=1}
    }
}

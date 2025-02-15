package regex.extraction.capwords;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class CapitalizedWordExtractor {

    // Regex to match words that start with an uppercase letter followed by lowercase letters
    private static final Pattern CAPITALIZED_PATTERN = Pattern.compile("\\b[A-Z][a-z]+\\b");

    /**
     * Extracts all capitalized words from the input text.
     * If the first word is "The", it is excluded from the result.
     *
     * @param text the input sentence
     * @return an array of extracted capitalized words (excluding "The" if it is the first word)
     */
    public static String[] extractCapitalizedWords(String text) {
        Matcher matcher = CAPITALIZED_PATTERN.matcher(text);
        List<String> words = new ArrayList<>();
        while (matcher.find()) {
            words.add(matcher.group());
        }
        // Exclude the first word if it is "The"
        if (!words.isEmpty() && words.get(0).equals("The")) {
            words.remove(0);
        }
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        String[] extracted = extractCapitalizedWords(input);
        for (String word : extracted) {
            System.out.println(word);
        }
        scanner.close();
    }
}

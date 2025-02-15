package regex.advance.languages;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class LanguageExtractor {

    // Regex to match words that start with a capital letter and have at least one more letter.
    // This helps avoid matching single-letter words like "I".
    private static final Pattern LANGUAGE_PATTERN = Pattern.compile("\\b[A-Z][a-zA-Z]+\\b");

    /**
     * Extracts programming language names from the given text.
     * Assumes that programming languages in the text appear as capitalized words.
     *
     * @param text the input text
     * @return an array of extracted language names
     */
    public static String[] getLanguageNames(String text) {
        Matcher matcher = LANGUAGE_PATTERN.matcher(text);
        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            String word = matcher.group();
            // Only add words with length > 1 to avoid matching "I"
            if (word.length() > 1) {
                languages.add(word);
            }
        }
        return languages.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        String[] languages = getLanguageNames(input);
        // Print extracted languages separated by commas
        if (languages.length > 0) {
            System.out.println(String.join(", ", languages));
        }
        scanner.close();
    }
}

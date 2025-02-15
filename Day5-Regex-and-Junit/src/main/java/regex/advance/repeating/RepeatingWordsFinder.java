package regex.advance.repeating;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepeatingWordsFinder {

    // Regex to match consecutive repeating words (case-sensitive).
    // \b(\w+)\s+\1\b captures a word followed by one or more whitespace and the same word.
    private static final Pattern REPEATING_PATTERN = Pattern.compile("\\b(\\w+)\\s+\\1\\b");

    /**
     * Extracts repeating words that appear consecutively in the given text.
     * Returns each repeated word only once (preserving order of appearance).
     *
     * @param text the input sentence.
     * @return an array of unique repeating words.
     */
    public static String[] getRepeatingWords(String text) {
        Matcher matcher = REPEATING_PATTERN.matcher(text);
        Set<String> repeatedWords = new LinkedHashSet<>();
        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }
        return repeatedWords.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        String[] repeatingWords = getRepeatingWords(input);
        if (repeatingWords.length > 0) {
            System.out.println(String.join(", ", repeatingWords));
        } else {
            System.out.println("No repeating words found.");
        }
        scanner.close();
    }
}

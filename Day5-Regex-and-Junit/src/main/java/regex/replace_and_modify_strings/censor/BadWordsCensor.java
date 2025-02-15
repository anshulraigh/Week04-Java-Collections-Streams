package regex.replace_and_modify_strings.censor;

import java.util.Scanner;

public class BadWordsCensor {

    // List of bad words to censor (case-insensitive)
    private static final String[] BAD_WORDS = {"damn", "stupid"};

    /**
     * Replaces each occurrence of bad words in the input sentence with "****".
     *
     * @param sentence the input sentence
     * @return the censored sentence
     */
    public static String censorBadWords(String sentence) {
        String censored = sentence;
        for (String badWord : BAD_WORDS) {
            // (?i) makes the match case-insensitive and \\b ensures whole word matching.
            censored = censored.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }
        return censored;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        String result = censorBadWords(input);
        System.out.println(result);
        scanner.close();
    }
}

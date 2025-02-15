package regex.extraction.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EmailExtractor {
    // Regex to match email addresses
    private static final Pattern EMAIL_PATTERN = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b");

    /**
     * Extracts and prints all email addresses found in the given text.
     *
     * @param text the input text
     */
    public static void extractEmails(String text) {
        Matcher matcher = EMAIL_PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * Extracts all email addresses from the text and returns them as an array.
     * This method is used for testing purposes.
     *
     * @param text the input text
     * @return an array of email addresses
     */
    public static String[] getEmails(String text) {
        Matcher matcher = EMAIL_PATTERN.matcher(text);
        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        extractEmails(input);
        scanner.close();
    }
}

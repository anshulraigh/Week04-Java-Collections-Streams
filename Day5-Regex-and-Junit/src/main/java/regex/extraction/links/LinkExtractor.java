package regex.extraction.links;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LinkExtractor {
    // Regex to match HTTP and HTTPS links.
    // This pattern matches URLs starting with http:// or https:// followed by non-space characters.
    private static final Pattern LINK_PATTERN = Pattern.compile("\\bhttps?://[\\w\\-.]+(?:\\.[a-zA-Z]{2,})(?:/[\\w\\-./?%&=+#]*)?\\b");

    /**
     * Extracts and prints all links from the given text.
     * @param text the input text
     */
    public static void extractLinks(String text) {
        Matcher matcher = LINK_PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * Extracts all links from the text and returns them as an array.
     * This method is intended for testing purposes.
     * @param text the input text
     * @return an array of extracted links
     */
    public static String[] getLinks(String text) {
        Matcher matcher = LINK_PATTERN.matcher(text);
        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }
        return links.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        extractLinks(input);
        scanner.close();
    }
}

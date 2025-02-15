package regex.advance.currency;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class CurrencyExtractor {

    // Regex to match currency values:
    // - An optional dollar sign ($)
    // - Followed by one or more digits
    // - Followed by a decimal point and exactly two digits.
    private static final Pattern CURRENCY_PATTERN = Pattern.compile("\\$?\\d+\\.\\d{2}");

    /**
     * Extracts all currency values from the given text.
     * @param text the input text.
     * @return an array of currency values found in the text.
     */
    public static String[] getCurrencyValues(String text) {
        Matcher matcher = CURRENCY_PATTERN.matcher(text);
        List<String> currencies = new ArrayList<>();
        while (matcher.find()) {
            currencies.add(matcher.group());
        }
        return currencies.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        String[] values = getCurrencyValues(input);
        if (values.length > 0) {
            System.out.println(String.join(", ", values));
        }
        scanner.close();
    }
}

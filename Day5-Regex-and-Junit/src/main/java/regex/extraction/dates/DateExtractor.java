package regex.extraction.dates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DateExtractor {
    // Regex to match dates in dd/mm/yyyy format.
    // dd: 01 to 31, mm: 01 to 12, yyyy: any four digits.
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b"
    );

    /**
     * Extracts and prints all dates in dd/mm/yyyy format from the given text.
     * @param text The input text.
     */
    public static void extractDates(String text) {
        Matcher matcher = DATE_PATTERN.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    /**
     * Extracts all dates in dd/mm/yyyy format from the given text and returns them as an array.
     * This method is intended for testing purposes.
     * @param text The input text.
     * @return an array of dates found in the text.
     */
    public static String[] getDates(String text) {
        Matcher matcher = DATE_PATTERN.matcher(text);
        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        extractDates(input);
        scanner.close();
    }
}

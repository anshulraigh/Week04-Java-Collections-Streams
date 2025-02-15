package junit.advance.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Formatter for the input date format: yyyy-MM-dd
    private static final DateTimeFormatter INPUT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    // Formatter for the output date format: dd-MM-yyyy
    private static final DateTimeFormatter OUTPUT_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /**
     * Converts a date from yyyy-MM-dd format to dd-MM-yyyy format.
     *
     * @param inputDate the date in yyyy-MM-dd format
     * @return the date in dd-MM-yyyy format
     * @throws IllegalArgumentException if the input date is not in the expected format
     */
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, INPUT_FORMATTER);
            return date.format(OUTPUT_FORMATTER);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format");
        }
    }
}

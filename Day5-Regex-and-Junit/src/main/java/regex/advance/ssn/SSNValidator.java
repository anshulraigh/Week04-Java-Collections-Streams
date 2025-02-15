package regex.advance.ssn;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SSNValidator {

    // Regex to match a valid SSN: three digits, a hyphen, two digits, a hyphen, and four digits.
    private static final Pattern SSN_PATTERN = Pattern.compile("^\\d{3}-\\d{2}-\\d{4}$");

    /**
     * Checks if the provided SSN string is valid.
     *
     * @param ssn the SSN as a string
     * @return true if the SSN is valid, false otherwise.
     */
    public static boolean isValidSSN(String ssn) {
        return SSN_PATTERN.matcher(ssn).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing an SSN:");
        String input = scanner.nextLine();

        // Extract potential SSN (for simplicity, assume the SSN is the first occurrence of a pattern)
        // In a more robust solution, you might extract and validate multiple matches.
        String[] parts = input.split("\\s+");
        String ssnCandidate = "";
        for (String part : parts) {
            if (isValidSSN(part)) {
                ssnCandidate = part;
                break;
            }
        }

        if (!ssnCandidate.isEmpty() && isValidSSN(ssnCandidate)) {
            System.out.println("\"" + ssnCandidate + "\" is valid");
        } else {
            System.out.println("No valid SSN found or the SSN is invalid");
        }
        scanner.close();
    }
}

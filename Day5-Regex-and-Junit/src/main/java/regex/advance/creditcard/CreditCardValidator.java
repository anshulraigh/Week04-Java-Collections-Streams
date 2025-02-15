package regex.advance.creditcard;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidator {

    // Regex to match a Visa card (starts with 4) or a MasterCard (starts with 5) with exactly 16 digits.
    private static final Pattern CARD_PATTERN = Pattern.compile("^(?:4\\d{15}|5\\d{15})$");

    /**
     * Checks if the provided credit card number is valid.
     * Valid if it is either a Visa card (starts with 4) or a MasterCard (starts with 5), and has 16 digits.
     *
     * @param cardNumber the credit card number as a string.
     * @return true if valid, false otherwise.
     */
    public static boolean isValidCreditCard(String cardNumber) {
        return CARD_PATTERN.matcher(cardNumber).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String input = scanner.nextLine();

        if (isValidCreditCard(input)) {
            System.out.println("Valid credit card number.");
        } else {
            System.out.println("Invalid credit card number.");
        }
        scanner.close();
    }
}

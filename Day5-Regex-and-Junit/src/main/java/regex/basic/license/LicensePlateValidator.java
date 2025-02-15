package regex.basic.license;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LicensePlateValidator {
    // License plate format:
    // - Starts with two uppercase letters, followed by four digits.
    // Regex: ^[A-Z]{2}\d{4}$
    private static final Pattern LICENSE_PATTERN = Pattern.compile("^[A-Z]{2}\\d{4}$");

    public static boolean isValid(String licensePlate) {
        return LICENSE_PATTERN.matcher(licensePlate).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter license plate number: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}

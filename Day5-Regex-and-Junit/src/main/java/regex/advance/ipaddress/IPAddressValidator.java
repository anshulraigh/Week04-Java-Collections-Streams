package regex.advance.ipaddress;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidator {

    // Regex to validate an IPv4 address.
    // This regex matches four groups of numbers (0-255) separated by dots.
    private static final Pattern IPV4_PATTERN = Pattern.compile(
            "^(?:(?:25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(?:25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$"
    );

    /**
     * Checks if the provided IP address is valid.
     *
     * @param ip the IP address as a string.
     * @return true if the IP address is valid, false otherwise.
     */
    public static boolean isValidIPAddress(String ip) {
        return IPV4_PATTERN.matcher(ip).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an IPv4 address: ");
        String input = scanner.nextLine();

        if (isValidIPAddress(input)) {
            System.out.println("Valid IP address.");
        } else {
            System.out.println("Invalid IP address.");
        }
        scanner.close();
    }
}

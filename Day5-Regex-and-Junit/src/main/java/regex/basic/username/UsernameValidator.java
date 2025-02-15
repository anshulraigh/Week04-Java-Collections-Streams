package regex.basic.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    // A valid username must:
    // - Start with a letter
    // - Contain only letters, numbers, and underscores
    // - Be between 5 and 15 characters long
    // Regex: ^[A-Za-z][A-Za-z0-9_]{4,14}$
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{4,14}$");

    public static boolean isValid(String username) {
        return USERNAME_PATTERN.matcher(username).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (isValid(username)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}

package regex.basic.hexcolor;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator {
    // A valid hex color must:
    // - Start with a #
    // - Followed by exactly 6 hexadecimal characters (0-9, A-F, a-f)
    // Regex: ^#[A-Fa-f0-9]{6}$
    private static final Pattern HEX_PATTERN = Pattern.compile("^#[A-Fa-f0-9]{6}$");

    public static boolean isValid(String colorCode) {
        return HEX_PATTERN.matcher(colorCode).matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hex color code: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        scanner.close();
    }
}

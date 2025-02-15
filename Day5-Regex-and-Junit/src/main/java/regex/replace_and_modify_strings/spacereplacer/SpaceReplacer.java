package regex.replace_and_modify_strings.spacereplacer;

import java.util.Scanner;

public class SpaceReplacer {

    /**
     * Replaces multiple spaces in the input string with a single space.
     * Also trims leading and trailing spaces.
     *
     * @param input the original string
     * @return the modified string with single spaces
     */
    public static String replaceMultipleSpaces(String input) {
        // Replace one or more whitespace characters with a single space and trim the result.
        return input.replaceAll("\\s+", " ").trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = scanner.nextLine();
        String result = replaceMultipleSpaces(input);
        System.out.println(result);
        scanner.close();
    }
}

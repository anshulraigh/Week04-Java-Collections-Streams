package junit.basic.stringutils;

public class StringUtils {

    /**
     * Returns the reverse of the given string.
     * @param str the input string
     * @return the reversed string
     */
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Returns true if the given string is a palindrome.
     * Comparison is case-sensitive.
     * @param str the input string
     * @return true if str is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        return str.equals(reverse(str));
    }

    /**
     * Converts the given string to uppercase.
     * @param str the input string
     * @return the string in uppercase
     */
    public static String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}

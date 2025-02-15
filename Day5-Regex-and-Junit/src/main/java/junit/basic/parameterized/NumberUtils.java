package junit.basic.parameterized;

public class NumberUtils {

    /**
     * Returns true if the given number is even.
     * @param number the number to check
     * @return true if even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

package junit.basic.exceptionhandling;

public class ExceptionHandler {

    /**
     * Divides two integers.
     * @param a the numerator
     * @param b the denominator
     * @return the result of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

package junit.basic.calculator;

public class Calculator {

    /**
     * Adds two integers.
     * @param a first operand
     * @param b second operand
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * @param a first operand
     * @param b second operand
     * @return the difference between a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a first operand
     * @param b second operand
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first integer by the second.
     * @param a the numerator
     * @param b the denominator
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

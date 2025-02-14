package exceptionpropagation;

import org.junit.Test;
import static org.junit.Assert.*;

public class InterestCalculatorTest {

    @Test
    public void testValidInterestCalculation() {
        double interest = InterestCalculator.calculateInterest(1000, 5, 2);
        assertEquals(100.0, interest, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeAmountThrowsException() {
        InterestCalculator.calculateInterest(-1000, 5, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRateThrowsException() {
        InterestCalculator.calculateInterest(1000, -5, 2);
    }
}

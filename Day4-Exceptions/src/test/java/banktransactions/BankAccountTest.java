package banktransactions;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testValidWithdrawal() {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(500);
            assertEquals(500, account.getBalance(), 0.01);
        } catch (Exception e) {
            fail("No exception should be thrown for valid withdrawal.");
        }
    }

    @Test
    public void testInsufficientBalance() {
        BankAccount account = new BankAccount(500);
        try {
            account.withdraw(600);
            fail("Should have thrown InsufficientBalanceException");
        } catch (InsufficientBalanceException e) {
            assertEquals("Insufficient balance!", e.getMessage());
        }
    }

    @Test
    public void testNegativeWithdrawal() {
        BankAccount account = new BankAccount(500);
        try {
            account.withdraw(-100);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            assertEquals("Invalid amount!", e.getMessage());
        }
    }

    @Test
    public void testNegativeInitialBalance() {
        try {
            new BankAccount(-500);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Initial balance cannot be negative!", e.getMessage());
        }
    }
}

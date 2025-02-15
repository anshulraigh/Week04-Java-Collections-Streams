package junit.advance.banking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testDepositAndBalanceUpdate() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);

        account.deposit(50.0);
        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawalAndBalanceUpdate() {
        BankAccount account = new BankAccount();
        account.deposit(200.0);
        account.withdraw(80.0);
        assertEquals(120.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawalFailsForInsufficientFunds() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(150.0);
        });
        assertEquals("Insufficient funds.", exception.getMessage());
        // Ensure balance remains unchanged.
        assertEquals(100.0, account.getBalance(), 0.001);
    }
}

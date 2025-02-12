package banking_system.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import banking_system.BankingSystem;

public class BankingSystemTest {
    @Test
    public void testAddAccount() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1001, 4000.0);
        assertEquals(4000.0, bank.getBalance(1001));
    }

    @Test
    public void testDeposit() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1002, 2000.0);
        bank.deposit(1002, 500.0);
        assertEquals(2500.0, bank.getBalance(1002));
    }
}

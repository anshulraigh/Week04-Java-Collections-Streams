package junit.advance.banking;

public class BankAccount {
    private double balance;

    /**
     * Deposits the given amount into the account.
     * @param amount the amount to deposit; must be non-negative.
     */
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative.");
        }
        balance += amount;
    }

    /**
     * Withdraws the given amount from the account.
     * @param amount the amount to withdraw; must be non-negative.
     * @throws IllegalArgumentException if the amount exceeds the current balance.
     */
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    /**
     * Returns the current balance of the account.
     * @return the current balance.
     */
    public double getBalance() {
        return balance;
    }
}

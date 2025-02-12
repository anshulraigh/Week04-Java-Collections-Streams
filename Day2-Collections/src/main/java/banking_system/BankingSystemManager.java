package banking_system;

public class BankingSystemManager {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount(1001, 5000.0);
        bank.addAccount(1002, 3000.0);
        bank.addAccount(1003, 7000.0);

        bank.deposit(1002, 2000.0);
        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1003);

        bank.displaySortedAccounts();
        bank.processWithdrawals();
    }
}

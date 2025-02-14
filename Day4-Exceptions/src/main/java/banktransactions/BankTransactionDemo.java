package banktransactions;

import java.util.Scanner;

public class BankTransactionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Creating account with initial balance
            System.out.print("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            BankAccount account = new BankAccount(initialBalance);

            // Taking withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            // Performing withdrawal
            account.withdraw(amount);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}

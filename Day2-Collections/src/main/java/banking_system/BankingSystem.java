package banking_system;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        double newBalance = accounts.get(accountNumber) + amount;
        sortedAccounts.remove(accounts.get(accountNumber));
        accounts.put(accountNumber, newBalance);
        sortedAccounts.put(newBalance, accountNumber);
    }

    public double getBalance(int accountNumber) {
        return accounts.getOrDefault(accountNumber, 0.0);
    }

    public void requestWithdrawal(int accountNumber) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        withdrawalQueue.add(accountNumber);
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for Account: " + accountNumber);
        }
    }

    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance: " + sortedAccounts);
    }
}

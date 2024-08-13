package com.assignment3;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            super.withdraw(amount); 
        } else {
            System.out.println("Withdrawal denied: Balance cannot fall below $100.");
        }
    }
}
public class Accounts {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(500.0);
        savingsAccount.deposit(150.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.withdraw(250.0);
        System.out.println("Final balance: $" + savingsAccount.getBalance());
    }
}

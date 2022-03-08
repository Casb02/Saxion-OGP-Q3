package nl.saxion.oop.week3.models;

public class BankAccount {
    private String iban;
    private double balance = 0.0;

    public BankAccount(String iban) {
        this.iban = iban;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(double amount, BankAccount otherAccount) {
        withdraw(amount);
        otherAccount.deposit(amount);
    }

    public String getIban() {
        return iban;
    }

    public String toString() {
        return "Account " + iban + " has a balance of " + balance + " euro";
    }
}
package nl.saxion.oop.week3.models.accounts;

import nl.saxion.oop.week3.models.BankAccount;

public class Saving extends BankAccount {
    private Checking ownerAccount;
    private double interestRate;

    public Saving(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void addCheckingsAccount(Checking ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
        super.withdraw(amount);
        } else throw new IllegalArgumentException("You can't go in debt in a saving account");
    }

    public void transfer(double amount, Checking account) {
        if (!(getBalance() >= amount))  throw new IllegalArgumentException("You can't go in debt in a saving account");
        if (account == ownerAccount) {
            super.withdraw(amount);
            account.deposit(amount);
        } else throw new IllegalArgumentException("You can't transfer money to another account that is not yours");
    }

    public void addYearlyInterest() {
        double interest = getBalance() * interestRate;
        super.deposit(interest);
    }

    @Override
    public String toString() {
        return "Checking account " + super.toString();
    }
}

package nl.saxion.oop.week3.models.accounts;

import nl.saxion.oop.week3.models.BankAccount;

public class Checking extends BankAccount {

    public Checking(String iban, double balance) {
        super(iban);
        deposit(balance);
    }

    @Override
    public String toString() {
        return "Checking account " + super.toString();
    }
}

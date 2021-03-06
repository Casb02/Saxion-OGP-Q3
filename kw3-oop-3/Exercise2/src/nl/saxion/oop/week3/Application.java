package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week3.models.accounts.Checking;
import nl.saxion.oop.week3.models.accounts.Saving;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        // TODO: Write your own implementations for the BankAccount classes.

        // We used the code below to create the images!
        // Accounts for person 1
        Checking checkingPerson1 = new Checking("NL02ABNA0123456789", 500);
        Saving savingPerson1 = new Saving("NL03ABNA9876543210", 3.5);

        // Register that there is a relationship between the saving account and the checking account
        savingPerson1.addCheckingsAccount(checkingPerson1);

        // Accounts for person 2
        Checking checking1Person2 = new Checking("NL02RABO0111111111", 0);
        Checking checking2Person2 = new Checking("NL02RABO0222222222", 0);
        Saving savingPerson2 = new Saving("NL02RABO0333333333", 2.0);

        // Register that there is a relationship between the saving account and the checking accounts
        savingPerson2.addCheckingsAccount(checking1Person2);
        savingPerson2.addCheckingsAccount(checking2Person2);

        // Deposit some money to each account
        checkingPerson1.deposit(100);
        checking1Person2.deposit(300);
        checking2Person2.deposit(250);

        // Print state
        SaxionApp.printLine(checkingPerson1);
        SaxionApp.printLine(savingPerson1);
        SaxionApp.printLine(checking1Person2);
        SaxionApp.printLine(checking2Person2);
        SaxionApp.printLine(savingPerson2);

        SaxionApp.pause();
        SaxionApp.clear();

        // Withdraw some money from the accounts and transfer also some money
        checkingPerson1.withdraw(50);
        checking1Person2.withdraw(200);
        checking2Person2.transfer(250, savingPerson2);
        savingPerson2.transfer(20, checking1Person2);
        savingPerson2.addYearlyInterest();

        // Print state
        SaxionApp.printLine(checkingPerson1);
        SaxionApp.printLine(savingPerson1);
        SaxionApp.printLine(checking1Person2);
        SaxionApp.printLine(checking2Person2);
        SaxionApp.printLine(savingPerson2);
    }
}

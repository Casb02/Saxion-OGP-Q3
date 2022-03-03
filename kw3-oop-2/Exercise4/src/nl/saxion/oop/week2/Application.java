package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week2.model.Passenger;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        Airplane airplane = new Airplane(10);
        int menuInput = -1;
        do {
            // We'll help you out by generating a random passenger to load.. Have a look at the method definition in the Passenger class!
            Passenger nextPassenger = Passenger.generateRandomPassenger();

            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load next passenger (" + nextPassenger + ")");
            SaxionApp.printLine("* 2) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");

            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                SaxionApp.printLine("The next passenger is: " + nextPassenger.toString());
                SaxionApp.print("They have ");
                SaxionApp.print(nextPassenger.getLuggage().size(), Color.ORANGE);
                SaxionApp.print(" bags with a total weight of ");
                SaxionApp.print(nextPassenger.getTotalLuggageWeight(), Color.ORANGE);
                SaxionApp.printLine(" kg.");

                SaxionApp.printLine();

                airplane.loadPassenger(nextPassenger);

                SaxionApp.pause();
            } else if (menuInput == 2) {

                if (airplane.isLocked()) {
                    airplane.unlockDoor();
                    SaxionApp.printLine("Doors unlocked!");
                } else {
                    airplane.lockDoor();
                    SaxionApp.printLine("Doors locked!");

                }

                SaxionApp.pause();
            } else if (menuInput == 9) {

                if (airplane.depart()) {
                    SaxionApp.printLine("The plane has departed!");
                } else {
                    SaxionApp.printLine("The plane is not ready to depart!" + airplane.depart());
                }
                SaxionApp.pause();
            }

        } while (menuInput != 0);

    }
}

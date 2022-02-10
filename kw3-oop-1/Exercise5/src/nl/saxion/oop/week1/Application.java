package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        Airplane plane = new Airplane();

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load passengers");
            SaxionApp.printLine("* 2) Load luggage");
            SaxionApp.printLine("* 3) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {
                plane.loadPassengers();
                SaxionApp.pause();
            } else if (menuInput == 2) {
                plane.loadLuggage();
                SaxionApp.pause();
            } else if (menuInput == 3) {
                plane.changeLock();
                SaxionApp.pause();
            } else if (menuInput == 9) {
                plane.depart();
                SaxionApp.pause();
            }

        } while (menuInput != 0);

    }
}

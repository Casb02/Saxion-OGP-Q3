package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Airplane {
    private boolean passengers = false;
    private boolean luggage = false;
    private boolean lock = false;


    public void loadPassengers() {
        if (!lock) {
            passengers = true;
            SaxionApp.printLine("Passengers loaded!", Color.green);
        } else {
            SaxionApp.print("The plane is locked, cannot load passengers", Color.red);
        }
    }

    public void loadLuggage() {
        if (!lock) {
            luggage = true;
            SaxionApp.printLine("Luggage loaded!", Color.green);
        } else {
            SaxionApp.print("The plane is locked, cannot load luggage", Color.red);
        }
    }

    public void changeLock() {
        lock = !lock;
        SaxionApp.printLine("Lock is now " + (lock ? "Locked" : "Unlocked"), Color.green);
    }


    public void depart() {
        if (lock && passengers && luggage) {
            SaxionApp.printLine("Departing!", Color.green);
        } else {
            SaxionApp.printLine("Can't depart!", Color.red);
        }
    }

}


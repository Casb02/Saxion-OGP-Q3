package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;


public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        // Create a TrainComparment instance.
        TrainCompartment compartment = new TrainCompartment();


        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show compartment details ");
            SaxionApp.printLine("* 2) Passenger enters");
            SaxionApp.printLine("* 3) Passenger leaves");
            SaxionApp.printLine("* 0) Exit program");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                SaxionApp.printLine("Amount of seats compartment: " + compartment.getNumberOfSeats());
                SaxionApp.printLine("Class of compartment: " + compartment.getCompartmentClass());
                SaxionApp.printLine("Seats in use: " + compartment.getNumberOfSeatsInUse());
                SaxionApp.pause();

            } else if (menuInput == 2) {

                if (compartment.getNumberOfSeatsInUse() >= 50) {
                    SaxionApp.printLine("The compartment is full");
                } else {
                    compartment.enter();
                    SaxionApp.printLine("A passenger enters the train...");
                }
                SaxionApp.pause();

            } else if (menuInput == 3) {

                if (compartment.getNumberOfSeatsInUse() > 0) {
                    compartment.leave();
                    SaxionApp.printLine("A passenger leaves the train...");
                } else {
                    SaxionApp.printLine("There are no passengers in the compartment");
                }

                SaxionApp.pause();
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }
}
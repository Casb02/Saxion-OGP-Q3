package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week3.models.buidlings.Home;
import nl.saxion.oop.week3.models.buidlings.Office;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 200);
    }

    public void run() {

        // TODO: Initialize a "home" and "office".
        Home home = new Home("TestStraat", "1234AB", 450, "Tom Bijen", false, 450000.00);
        Office office = new Office("IndustrieStraat", "7654ZX", 1600, "Pim Meulenkamp", 10);

        // Look at the code below to see how we want to use the classes you need to make!
        // Print objects
        SaxionApp.printLine(home);
        SaxionApp.printLine(office);

        // Change owner of the house
        home.setOwner("Tristan Pothoven");

        // Change company and number of employees
        office.setName("University of Twente");
        office.setEmployeeSize(200);

        // Print objects again after changes
        SaxionApp.printLine(home);
        SaxionApp.printLine(office);

        // Dev note: no home drawings today! if you want to see the drawings, set it in the task description. and i will add it.
        // home.draw(20, 150);
    }
}

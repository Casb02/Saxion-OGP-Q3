package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        //Note: Uncomment the code to test the different parts of the program.

        //Control test person
        SaxionApp.printLine("Control test person:");
        try {
            Person goodPerson = new Person("Goed", "Persoon");
            goodPerson.setAge(33);
            goodPerson.setZipCode("ABCD12");
            goodPerson.setPhonenumber("0612345678");
            SaxionApp.printLine(goodPerson);
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 1: check invalid age
        SaxionApp.printLine("Test 1:");
        try {
            Person p1 = new Person("Persoon", "een");
            p1.setAge(-1);
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 2: check invalid zipcode (too short)
        SaxionApp.printLine("Test 2:");
        try {
            Person p2 = new Person("Persoon", "twee");
            p2.setZipCode("1232S");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 3: check invalid zipcode (not numeric)
        SaxionApp.printLine("Test 3:");
        try {
            Person p3 = new Person("Persoon", "drie");
            p3.setZipCode("ABCD12");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 4: check invalid zipcode (no letters)
        SaxionApp.printLine("Test 4:");
        try {
            Person p4 = new Person("Persoon", "vier");
            p4.setZipCode("ABCD12");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 5: check phone number (too long)
        SaxionApp.printLine("Test 5:");
        try {
            Person p5 = new Person("Persoon", "Vijf");
            p5.setPhonenumber("01234567890");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

        // Test 6: check phone number (not starting with a 0)
        SaxionApp.printLine("Test 6:");
        try {
            Person p6 = new Person("Persoon", "Zes");
            p6.setPhonenumber("8123456789");
        } catch (IllegalArgumentException ex) {
            SaxionApp.printLine("Error: " + ex.getMessage());
        }

    }
}
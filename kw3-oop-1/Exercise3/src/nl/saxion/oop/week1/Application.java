package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {

        SaxionApp.turnBorderOff();

        Circle c = new Circle(100, 250, 250);

        // We used the following lines of code to produce the sample_output.png file.
        SaxionApp.printLine("x: " + c.getX() + ", y: " + c.getY() + ", radius: " + c.getRadius());
        SaxionApp.printLine("area: " + c.area() + ", perimeter: " + c.perimeter());

        c.draw();

    }
}
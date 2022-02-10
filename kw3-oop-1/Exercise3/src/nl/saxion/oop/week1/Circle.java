package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Circle {
    private int radius;
    private int x;
    private int y;

    //create constructor for Circle, x and y cant be negative
    public Circle(int radius, int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x and y cant be negative");
        }
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    //getter for radius
    public double getRadius() {
        return radius;
    }

    //getter for x
    public int getX() {
        return x;
    }

    //getter for y
    public int getY() {
        return y;
    }

    //setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //setter for x
    public void setX(int x) {
        this.x = x;
    }

    //setter for y
    public void setY(int y) {
        this.y = y;
    }

    //calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    //calculate the perimeter of the circle
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    //draw the circle
    public void draw() {
        SaxionApp.drawCircle(x, y, radius);
    }
}

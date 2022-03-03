package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Rectangle() {}

    public Rectangle(Color color) {
        this.color = color;
    }

    public Rectangle(int x, int y) {
        this(x, y, 100, 100);
    }

    public Rectangle(int x, int y, Color color) {
        this(x, y, 100, 100, Color.red);
    }

    public Rectangle(int x, int y, int width, int height) {
        this(x, y, width, height, Color.red);
    }

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw() {
        SaxionApp.setFill(color);
        SaxionApp.drawRectangle(x, y, width, height);
    }
}

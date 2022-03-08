package nl.saxion.oop.week4.models.shapes;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week4.models.Shape;

import java.awt.*;

public class Square extends Shape {
    private int length;

    public Square(int x, int y, int length, Color color) {
        super(x, y, color);
        this.length = length;
        setArea(length * length);
        setCircumference(4 * length);
    }

    @Override
    public void draw() {
        SaxionApp.setFill(getColor());
        SaxionApp.drawRectangle(getX(), getY(), length, length);
    }
}

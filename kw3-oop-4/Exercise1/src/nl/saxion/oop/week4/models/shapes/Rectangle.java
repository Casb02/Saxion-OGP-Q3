package nl.saxion.oop.week4.models.shapes;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week4.models.Shape;

import java.awt.*;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x,y,color);
        this.width = width;
        this.height = height;
        setCircumference(width * 2 + height * 2);
        setArea(width * height);
    }

    @Override
    public void draw() {
        SaxionApp.setFill(getColor());
        SaxionApp.drawRectangle(getX(), getY(), width, height);
    }
}

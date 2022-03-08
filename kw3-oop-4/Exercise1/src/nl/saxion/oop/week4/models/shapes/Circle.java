package nl.saxion.oop.week4.models.shapes;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week4.models.Shape;

import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x,y,color);
        setCircumference(Math.PI * radius * radius);
        setArea(2 * Math.PI * radius);
        this.radius = radius;
    }

    @Override
    public void draw() {
        SaxionApp.setFill(getColor());
        SaxionApp.drawCircle(getX(), getY(), radius);
    }
}

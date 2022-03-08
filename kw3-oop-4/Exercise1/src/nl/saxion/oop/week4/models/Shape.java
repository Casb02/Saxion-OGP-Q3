package nl.saxion.oop.week4.models;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Shape {
    private Color color;
    private int x;
    private int y;
    private double area;
    private double circumference;

    public Shape(int x, int y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw() {
        SaxionApp.setFill(color);
        SaxionApp.drawPoint(x, y);
    }
}

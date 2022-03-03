package nl.saxion.oop.week3.models;

import nl.saxion.app.SaxionApp;

import java.awt.*;


public class Lamp {
    private boolean state;

    public void draw(int x, int y, int size) {
        SaxionApp.setFill(state ? Color.WHITE : Color.BLACK);
        SaxionApp.drawCircle(x, y, size);
    }

    public void turnOn() {
        state = true;
    }

    public void turnOff() {
        state = false;
    }

    public void toggle() {
        state = !state;
    }

    public boolean getState() {
        return state;
    }

    @Override
    public String toString() {
        return "is turned " + (state ? "on" : "off");
    }
}


package nl.saxion.oop.week3.models;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class PhilipsHUELamp extends DimmableLamp {
    private Color color = Color.WHITE;

    public PhilipsHUELamp(Color color) {
        super(100);
        this.color = color;
    }

    public void draw(int x, int y, int size) {
        int rgbBrightness = (int) (getBrightness() / 100.0 * 255);
        SaxionApp.setFill(getState() ? new Color(color.getRed(), color.getGreen(), color.getBlue(), rgbBrightness) : Color.BLACK);
        SaxionApp.drawCircle(x, y, size);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "color:" + color + ", brightness: " + getBrightness() + "% and is turned " + (getState() ? "on" : "off");
    }

}

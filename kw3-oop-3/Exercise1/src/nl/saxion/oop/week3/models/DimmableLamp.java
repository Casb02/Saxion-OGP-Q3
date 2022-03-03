package nl.saxion.oop.week3.models;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class DimmableLamp extends Lamp {
    private int brightness;

    public DimmableLamp(int brightness) {
        super();
        this.brightness = brightness;
    }

    public void draw(int x, int y, int size) {
        int rgbBrightness = (int) (brightness / 100.0 * 255);
        SaxionApp.setFill(getState() ? new Color(255, 255, 255, rgbBrightness) : Color.BLACK);
        SaxionApp.drawCircle(x, y, size);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else throw new IllegalArgumentException("Brightness must be between 0 and 100");
    }

    @Override
    public String toString() {
        return "brightness: " + getBrightness() + "% and is turned " + (getState() ? "on" : "off");
    }
}

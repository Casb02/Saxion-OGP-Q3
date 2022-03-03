package nl.saxion.oop.week2;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Yahtzee {
    private int[] diceOutcomes = new int[6];

    public String determineCombination(int[] diceOutcomes) {
        return "Dices: " + diceOutcomes[0] + ", " + diceOutcomes[1] + ", " + diceOutcomes[2] + ", " + diceOutcomes[3] + ", " + diceOutcomes[4] + ", " + diceOutcomes[5];
    }

    public int[] roll() {
        for (int i = 0; i <= 5; i++) {
            diceOutcomes[i] = (int) (Math.random() * 6 + 1);
        }
        return diceOutcomes;
    }

    public void draw() {
        for (int i = 0; i <= 5; i++) {
            SaxionApp.setFill(Color.white);
            SaxionApp.setBorderColor(Color.black);
            SaxionApp.drawRectangle(i * 55 + 100, 50, 50, 50);
            SaxionApp.drawText(String.valueOf(diceOutcomes[i]), i * 55 + 115, 65, 30);
        };
    }
}

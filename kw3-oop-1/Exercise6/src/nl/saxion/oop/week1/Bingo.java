package nl.saxion.oop.week1;

import java.util.ArrayList;
import java.util.Random;

public class Bingo {
    private int remaining = 75;
    private final ArrayList<Integer> usedBalls = new ArrayList<>();


    public int draw() {
        if (remaining >= 0) {
            remaining--;
            Random random = new Random();
            int number = random.nextInt(75) + 1;
            while (usedBalls.contains(number)) {
                number = random.nextInt(75) + 1;
            }
            usedBalls.add(number);
            return number;
        }
       throw new IllegalStateException("No more balls left");
    }

    public int getNumberOfBallsRemaining() {
        return remaining;
    }

    public void reset() {
        remaining = 75;
        usedBalls.clear();
    }



}

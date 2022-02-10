package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {

		Bingo bm = new Bingo();

		SaxionApp.printLine("Drawing 10 random numbers using the Bingo Mill!");
		for (int i = 0; i < 10; i++) {
			SaxionApp.printLine("Draw " + (i + 1) + ": " + bm.draw() + " (" + bm.getNumberOfBallsRemaining() + " balls remaining)");
		}

	}
}

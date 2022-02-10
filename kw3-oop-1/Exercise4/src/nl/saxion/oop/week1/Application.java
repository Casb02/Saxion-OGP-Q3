package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {

		Car myCar = new Car("BrandName", "A-123-CD");

		// Usage example, assume the car does 10 km to a litre gas:
		// myCar.getCurrentFuel(); --> Suppose this returns 50 litres
		// myCar.drive(100);
		// myCar.getCurrentFuel(); --> This should now return 40 litres


		int menuInput = -1;
		do {
			SaxionApp.clear();
			SaxionApp.printLine("***************************************");
			SaxionApp.printLine("* 1) Display statistics of the car ");
			SaxionApp.printLine("* 2) Drive some kilometers");
			SaxionApp.printLine("* 3) Refuel");
			SaxionApp.printLine("* 0) Exit program");
			SaxionApp.printLine("***************************************");

			SaxionApp.print("Please make a selection from the menu: ");
			menuInput = SaxionApp.readInt();

			SaxionApp.printLine();

			if(menuInput == 1) {

				SaxionApp.printLine(myCar.toString());

				SaxionApp.pause();
			} else if (menuInput == 2) {

				SaxionApp.print("Type how many KM you want ride: ");
				int km = SaxionApp.readInt();
				boolean res = myCar.drive(km);

				SaxionApp.printLine(res ? "You drove " + km + " Kilometers" : "You cannot drive that much", res ? Color.GREEN : Color.RED);

				SaxionApp.pause();
			} else if (menuInput == 3) {

				SaxionApp.print("Type how much liters you would like to tank: ");
				int fill = SaxionApp.readInt();
				boolean res = myCar.fuel(fill);

				SaxionApp.printLine(res ? "You filled the tank with " + fill + " liters" : "You cannot overfill the tank", res ? Color.GREEN : Color.RED);

				SaxionApp.pause();
			} else {
				SaxionApp.printLine("Goodbye!");
			}

		} while(menuInput != 0);
	}


}

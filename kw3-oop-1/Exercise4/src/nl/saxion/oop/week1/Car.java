package nl.saxion.oop.week1;

import java.util.Currency;

public class Car {
    //brand, license plate, tank size in litres, current tank position, fuel consumption (consumption 16 means 16 km on 1 litre of petrol) and mileage.
    private String brand;
    private String licensePlate;
    private int tankSize = 50;
    private int currentTankPosition = 0;
    private int fuelConsumption = 16;
    private int mileage = 0;

    public Car(String brand, String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return brand + " (" + licensePlate + "), tank info: (" + currentTankPosition + "/" + tankSize + "), mileage: " + mileage;
    }

    public boolean fuel(int liters) {
        int maxFill = tankSize - currentTankPosition;
        if (liters <= maxFill) {
            currentTankPosition += liters;
            return true;
        } else {
            return false;
        }
    }


    public boolean drive(int km) {
        int literCost = km / (fuelConsumption + 1);
        literCost = (int) Math.round(literCost) + 1;
        System.out.println("Liter cost: " + literCost);

        if (literCost <= currentTankPosition && literCost > 0) {
            currentTankPosition -= literCost;
            mileage += km;
            return true;
        } else {
            return false;
        }
    }
}

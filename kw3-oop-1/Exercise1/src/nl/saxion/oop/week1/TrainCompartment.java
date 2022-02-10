package nl.saxion.oop.week1;

public class TrainCompartment {
    private int numberOfSeats = 50;
    private int compartmentClass = 2;
    private int numberOfSeatsInUse = 49;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCompartmentClass() {
        return compartmentClass;
    }

    public int getNumberOfSeatsInUse() {
        return numberOfSeatsInUse;
    }

    public void enter() {
        if (numberOfSeatsInUse < numberOfSeats) {
            numberOfSeatsInUse++;
        }
    }

    public void leave() {
        if (numberOfSeatsInUse > 0) {
            numberOfSeatsInUse--;
        }
    }



}

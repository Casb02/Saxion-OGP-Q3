package nl.saxion.oop.week2;

import nl.saxion.oop.week2.model.Passenger;

import java.util.ArrayList;

public class Airplane {
    private int capacity = 0;
    private ArrayList<Passenger> passengers = new ArrayList<>();

    private boolean isLocked = false;

    public Airplane(int capacity) {
        this.capacity = capacity;
    }

    public void lockDoor() {
        isLocked = true;
    }

    public void unlockDoor() {
        isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean depart() {
        return isLocked;
    }

    public void loadPassenger(Passenger p) {
        if (isLocked) throw new IllegalStateException("Door is locked");
        if (passengers.size() == capacity) throw new IllegalStateException("Airplane is full");
        passengers.add(p);
    }
}

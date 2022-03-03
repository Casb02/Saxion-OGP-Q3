package nl.saxion.oop.week3.models.buidlings;

import nl.saxion.oop.week3.models.Building;

public class Home extends Building {
    private final boolean hasGarage;
    private final double price;
    private String owner;

    public Home(String address, String postcode, int surface, String owner, boolean hasGarage, double price) {
        super(address, postcode, surface);
        this.owner = owner;
        this.hasGarage = hasGarage;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Street: " + getAddress() + ", Postcode: " + getPostcode() + ", Is an Home " + "owner: " + owner + ", hasGarage: " + hasGarage + ", price: " + price;
    }
}


package nl.saxion.oop.week3.models;

public class Building {
    private String address;
    private String postcode;
    private int surface;

    public Building(String address, String postcode, int surface) {
        this.address = address;
        this.postcode = postcode;
        this.surface = surface;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public int getSurface() {
        return surface;
    }
}

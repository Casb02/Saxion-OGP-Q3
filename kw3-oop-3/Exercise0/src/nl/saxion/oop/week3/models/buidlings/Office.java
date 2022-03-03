package nl.saxion.oop.week3.models.buidlings;

import nl.saxion.oop.week3.models.Building;

public class Office extends Building {
    private String name;
    private int employeeSize;

    public Office(String address, String postcode, int surface, String name, int employeeSize) {
        super(address, postcode, surface);
        this.name = name;
        this.employeeSize = employeeSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeSize() {
        return employeeSize;
    }

    public void setEmployeeSize(int employeeSize) {
        this.employeeSize = employeeSize;
    }

    @Override
    public String toString() {
        return "Street: " + getAddress() + ", Postcode: " + getPostcode() + ", Is an Office " + "name: " + name + ", amount of employees: " + employeeSize;
    }
}

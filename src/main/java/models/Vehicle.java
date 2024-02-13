package models;

public abstract class Vehicle {
    private int numberOfWheels;
    private int maximumOccupancy;
    private float value;

    public Vehicle(int numberOfWheels, int maximumOccupancy, float value) {
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.value = value;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public abstract String startEngine();
}

public abstract class Vehicle {
    int numberOfWheels;
    int maximumOccupancy;
    float value;

    public Vehicle(int numberOfWheels, int maximumOccupancy, float value) {
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.value = value;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String startEngine() {
        return "engine starting";
    }
}

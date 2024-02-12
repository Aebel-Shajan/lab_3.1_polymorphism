public class Plane extends Vehicle{
    private int engineNumber;

    public Plane(int numberOfWheels, int maxOccupancy, float value, int engineNumber) {
        super(numberOfWheels, maxOccupancy, value);
        this.engineNumber = engineNumber;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public String fly() {
        return "wheeeee plane be flying";
    }
}

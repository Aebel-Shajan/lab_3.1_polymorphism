public class Car extends Vehicle {

    String model;
    public Car(int maximumOccupancy, float value, String model) {
        super(4, maximumOccupancy, value);
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String startEngine() {
        return "VROOM I AM A CAR, THIS IS THE SOUND A CAR MAKES";
    }

}

package models;

public class Boat extends Vehicle {
    private String type;

    public Boat(int maximumOccupancy, float value, String type) {
        super(0, maximumOccupancy, value);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String startEngine() {
        return "SWOOSH, THIS IS BOAT SOUND";
    }

    public String sail() {
        return "shhhshhhshhh";
    }
}

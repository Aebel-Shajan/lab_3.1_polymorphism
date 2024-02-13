package models;

import java.util.ArrayList;

public class Garage {

    private String owner;

    private ArrayList<Vehicle> vehicles;

    public Garage(String owner) {
        this.owner = owner;
        vehicles = new ArrayList<>();
    }

    public String getOwner() {
        return this.owner;
    }

    public int getVehicleCount() {
        return this.vehicles.size();
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }

    public float calculateCollectiveValue() {
        float totalValue = 0f;
        for (Vehicle vehicle: vehicles) {
            totalValue += vehicle.getValue();
        }
        return totalValue;
    }



}

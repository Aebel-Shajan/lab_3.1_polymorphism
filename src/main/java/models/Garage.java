package models;

import interfaces.IGetValue;

import java.util.ArrayList;

public class Garage {

    private String owner;

    private ArrayList<IGetValue> valuables;

    public Garage(String owner) {
        this.owner = owner;
        valuables = new ArrayList<>();
    }

    public String getOwner() {
        return this.owner;
    }

    public int getValuableCount() {
        return this.valuables.size();
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void addValuable(IGetValue valuable) {
        this.valuables.add(valuable);
    }

    public void removeValuable(IGetValue valuable) {
        this.valuables.remove(valuable);
    }

    public float calculateCollectiveValue() {
        float totalValue = 0f;
        for (IGetValue valuable: this.valuables) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }



}

package models;

import interfaces.IGetValue;

public class Piano implements IGetValue {
    private float value;

    public Piano(float value) {
        this.value = value;
    }

    @Override
    public float getValue() {
        return 0;
    }

}

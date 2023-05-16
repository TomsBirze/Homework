package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {
    private int fuelLevel;
    private final int maximumCapacity = 70;

    public FuelGauge() {
        fuelLevel = 0;
    }

    public void incrementFuel() {
        if (fuelLevel < maximumCapacity) {
            fuelLevel++;
        }
    }

    public void decrementFuel() {
        if (fuelLevel > 0) {
            fuelLevel--;
        }
    }

    public int getFuelLevel() {
        return fuelLevel;
    }
}
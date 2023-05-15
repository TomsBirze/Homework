package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {
    private int mileage;
    private final int maximumMileage = 999999;

    public void incrementMileage() {
        if (mileage < maximumMileage) {
            mileage++;
        } else {
            mileage = 0;
        }
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void decreaseFuel(FuelGauge fuelGauge) {
        int litersUsed = mileage / 10;
        for (int i = 0; i < litersUsed; i++) {
            fuelGauge.decrementFuel();
        }
    }
}


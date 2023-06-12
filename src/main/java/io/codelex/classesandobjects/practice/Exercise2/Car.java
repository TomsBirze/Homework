package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    private double startKilometers; // Starting odometer reading
    private double endKilometers; // Ending odometer reading
    private double liters; // Liters of gas used between the readings

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public void fillUp(int mileage, double liters) {
        this.startKilometers = this.endKilometers;
        this.endKilometers = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double kilometersTraveled = endKilometers - startKilometers;
        double consumption = kilometersTraveled / liters;
        return consumption;
    }

    public boolean gasHog() {
        double consumption = calculateConsumption();
        return consumption > 15.0;
    }


    public boolean economyCar() {
        double consumption = calculateConsumption();
        return consumption < 5.0;
    }
}

package io.codelex.classesandobjects.practice.Exercise3;

public class CarSimulation {
    public static void main(String[] args) {
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer();

        // fill the car up with fuel
        for (int i = 0; i < 70; i++) {
            fuelGauge.incrementFuel();
        }

        // simulate driving until the car runs out of fuel
        while (fuelGauge.getFuelLevel() > 0) {
            odometer.incrementMileage();
            odometer.decreaseFuel(fuelGauge);

            System.out.println("Mileage: " + odometer.getMileage() + " Fuel Level: " + fuelGauge.getFuelLevel());
        }

        System.out.println("Car has run out of fuel!");
    }
}

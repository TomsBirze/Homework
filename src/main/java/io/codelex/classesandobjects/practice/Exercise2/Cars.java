package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;

        System.out.print("Enter first cars start reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter first cars end reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter first cars liters consumed: ");
        liters = scan.nextDouble();

        Car firstCar = new Car(startKilometers, endKilometers, liters);

        System.out.print("Enter second cars start reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second cars end reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter second cars liters consumed: ");
        liters = scan.nextDouble();

        Car secondCar = new Car(startKilometers, endKilometers, liters);

        System.out.printf("Kilometers per liter are %.2f.", firstCar.calculateConsumption());
        if (firstCar.gasHog()) {
            System.out.println(" Car is a gas hog.");
        } else if (firstCar.economyCar()) {
            System.out.println(" That's an economy car.");
        } else {
            System.out.println(" The consumption is average.");
        }
        firstCar.fillUp(10500, 10);
        System.out.println("Fuel consumption: " + firstCar.calculateConsumption());


        System.out.printf("Kilometers per liter are %.2f.", secondCar.calculateConsumption());
        if (secondCar.gasHog()) {
            System.out.println(" Car is a gas hog.");
        } else if (secondCar.economyCar()) {
            System.out.println(" That's an economy car.");
        } else {
            System.out.println(" The consumption is average.");
        }

        secondCar.fillUp(11500, 12);
        System.out.println("Fuel consumption: " + secondCar.calculateConsumption());

    }
}

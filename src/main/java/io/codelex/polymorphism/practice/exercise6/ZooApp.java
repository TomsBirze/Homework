package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ZooApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String input = "";
        while (!input.equals("End")) {
            System.out.print("Enter the animal type (Cat/Tiger/Mouse/Zebra): ");
            String animalType = scanner.nextLine();
            if (animalType.equals("End")) {
                break;
            }
            System.out.print("Enter the animal name: ");
            String animalName = scanner.nextLine();

            System.out.print("Enter the animal weight: ");
            double animalWeight = scanner.nextDouble();
            scanner.nextLine(); // newline

            System.out.print("Enter the animal living region: ");
            String animalLivingRegion = scanner.nextLine();

            Animal animal = null;
            switch (animalType.toLowerCase()) {
                case "cat" -> {
                    System.out.print("Enter the cat breed: ");
                    String catBreed = scanner.nextLine();
                    animal = new Cat(animalName, animalWeight, animalLivingRegion, catBreed);
                }
                case "tiger" -> animal = new Tiger(animalName, animalWeight, animalLivingRegion);
                case "mouse" -> animal = new Mouse(animalName, animalWeight, animalLivingRegion);
                case "zebra" -> animal = new Zebra(animalName, animalWeight, animalLivingRegion);
                default -> System.out.println("Invalid animal type.");
            }

            if (animal != null) {
                animal.makeSound();
                System.out.print("Enter the food type: ");
                String foodType = scanner.nextLine();

                System.out.print("Enter the food quantity: ");
                int foodQuantity = scanner.nextInt();
                scanner.nextLine(); // newline

                Food food = null;
                switch (foodType.toLowerCase()) {
                    case "vegetable" -> food = new Vegetable(foodQuantity);
                    case "meat" -> food = new Meat(foodQuantity);
                    default -> System.out.println("Invalid food type.");
                }
                if (food != null) {
                    animal.eat(food);
                }
                animals.add(animal);
            }
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

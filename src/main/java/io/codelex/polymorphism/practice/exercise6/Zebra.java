package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    private static final String ANIMAL_TYPE = "Zebra";

    public Zebra(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zsiiip");
    }

    @Override
    protected void eat(Food food) {
        if (food instanceof Vegetable) {
            increaseFoodEaten(food.getQuantity());
        } else {
            System.out.println(ANIMAL_TYPE + "s are not eating that type of food!");
        }
    }

    @Override
    protected String getAdditionalInfo() {
        return "";
    }
}

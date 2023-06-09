package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {
    private static final String ANIMAL_TYPE = "Cat";
    private String breed;

    public Cat(String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    protected void eat(Food food) {
        increaseFoodEaten(food.getQuantity());
    }

    @Override
    protected String getAdditionalInfo() {
        return breed;
    }
}

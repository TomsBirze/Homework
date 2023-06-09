package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {
    private static final String ANIMAL_TYPE = "Tiger";

    public Tiger(String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    protected void eat(Food food) {
        if (food instanceof Meat) {
            increaseFoodEaten(food.getQuantity());
        } else {
            System.out.println(ANIMAL_TYPE + "s are not eating that type of food!");
        }
    }

    @Override
    protected void makeSound() {
        System.out.println("Rrrrooooaaarrr");
    }

    @Override
    protected String getAdditionalInfo() {
        return "";
    }
}

package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

abstract public class Animal {

    protected String animalName;
    //    protected String animalType;
    protected Double animalWeight;
    protected String foodEaten = "";
    protected String livingRegion;

    protected Animal(String animalName, double animalWeight, String livingRegion) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.livingRegion = livingRegion;
    }

    protected void makeSound() {
    }

    protected void eat(Food food) {
    }

    protected void increaseFoodEaten(int quantity) {
        this.foodEaten += quantity;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s\n[%s, %s, %s, %s, %s]",
                getClass().getSimpleName(), animalName, getAdditionalInfo(), decimalFormat.format(animalWeight),
                livingRegion, foodEaten);
    }

    protected abstract String getAdditionalInfo();
}



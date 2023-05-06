package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String Name = "Zed A. Shaw";
        int Age = 35;
        float Height = 74;
        double convertedHeight = Math.round(Height * 2.54 * 100.0) / 100.0; // inches to cm
        int Weight = 180;
        double convertedWeight = Math.round(Weight * 0.453592 * 100.0) / 100.0; // lbs to kilo
        String Eyes = "Blue";
        String Teeth = "White";
        String Hair = "Brown";

        System.out.println("Let's talk about " + Name + ".");
        System.out.println("He's " + convertedHeight + " centimeters tall.");
        System.out.println("He's " + convertedWeight + " kilos heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
        System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + convertedHeight + ", and " + convertedWeight
                + " I get " + (Age + convertedHeight + convertedWeight) + ".");
    }
}
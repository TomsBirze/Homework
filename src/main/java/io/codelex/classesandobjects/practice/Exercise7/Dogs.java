package io.codelex.classesandobjects.practice.Exercise7;

public class Dogs {
    public static void main(String[] args) {
        Dog Max = new Dog("Max", "male", "Lady", "Rocky");
        Dog Rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog Sparky = new Dog("Sparky", "male");
        Dog Buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog Sam = new Dog("Sam", "male");
        Dog Lady = new Dog("Lady", "female");
        Dog Molly = new Dog("Molly", "female");
        Dog Coco = new Dog("Coco", "female", "Molly", "Buster");

        Coco.fathersName();
        Sparky.fathersName();

        if (Coco.hasSameMotherAs(Rocky)) {
            System.out.println("Coco and Molly have the same mother.");
        } else {
            System.out.println("Coco and Molly have different mothers.");
        }
       
    }
}

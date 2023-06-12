package io.codelex.classesandobjects.practice.Exercise7;

public class Dogs {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        coco.setFather(buster);
        coco.setMother(molly);
        max.setMother(molly);
        max.setFather(rocky);
        rocky.setFather(sam);
        rocky.setMother(molly);
        buster.setFather(sparky);
        buster.setMother(lady);

        coco.fathersName();
        sparky.fathersName();

        if (coco.hasSameMotherAs(rocky)) {
            System.out.println("Coco and Molly have the same mother.");
        } else {
            System.out.println("Coco and Molly have different mothers.");
        }

    }
}
